package com.overlanwest.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.overlanwest.app.dto.users.response.UserResponse;
import com.overlanwest.app.repositories.UserRepositories;
import com.overlanwest.app.util.UserMapstruct;

@Service
public class UserService {

    @Autowired
    private UserRepositories userRepositories;

    @Autowired
    private UserMapstruct userMapstruct;
    

    @Transactional(readOnly = true)
    public Page<UserResponse> getALlUser (Pageable pageable){
        return userRepositories.findAll(pageable).map(userMapstruct::toDto);
    }   
}
