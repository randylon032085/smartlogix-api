package com.overlanwest.app.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.overlanwest.app.dto.users.request.CreateUserRequest;
import com.overlanwest.app.dto.users.response.UserResponse;
import com.overlanwest.app.models.Role;
import com.overlanwest.app.models.User;
import com.overlanwest.app.repositories.RoleRepositories;
import com.overlanwest.app.repositories.UserRepositories;
import com.overlanwest.app.util.UserMapstruct;

@Service
public class UserService {

    @Autowired
    private UserRepositories userRepositories;

    @Autowired RoleRepositories roleRepo;

    @Autowired
    private UserMapstruct userMapstruct;

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private JwtService jwtService;
    

    @Transactional(readOnly = true)
    public Page<UserResponse> getALlUser (Pageable pageable){
        return userRepositories.findAll(pageable).map(userMapstruct::toDto);
    }


    @Transactional
    public UserResponse createNewUser (CreateUserRequest createUserRequest) {

        User user = userMapstruct.toEntity(createUserRequest);

        BCryptPasswordEncoder bc = new BCryptPasswordEncoder(12);

        String hashedPassword = bc.encode(createUserRequest.getPassword());
        user.setPassword(hashedPassword);
        
       try{
        Role role = roleRepo.findByRolename(createUserRequest.getRolename());
        user.setRole(role);
       }catch(Exception e){
        throw new RuntimeException("Role not found");
       }
        
        User saveUser = userRepositories.save(user);

        return userMapstruct.toDto(saveUser);
    }


    public String verify(User user) {
       Authentication auth = authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        if(auth.isAuthenticated())
            return jwtService.generateToken(user.getUsername());
        return "failed";
        
  
    }   
}
