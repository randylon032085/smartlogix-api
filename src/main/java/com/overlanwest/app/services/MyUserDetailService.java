package com.overlanwest.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.overlanwest.app.models.User;
import com.overlanwest.app.models.UserPrincipal;
import com.overlanwest.app.repositories.UserRepositories;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepositories userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepo.findByUsername(username);

        if(user == null){
            System.out.println("User not found" + user);

            throw new UsernameNotFoundException("User not found: " + user);
        }
        return new UserPrincipal(user);
    }
    
}
