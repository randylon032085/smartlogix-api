package com.overlanwest.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.overlanwest.app.models.User;
import com.overlanwest.app.services.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {
    
    @Autowired
    private UserService userServ;

    @PostMapping("/login")
    public String loginUser (@RequestBody User user){

        return userServ.verify(user);
    }

    
}
