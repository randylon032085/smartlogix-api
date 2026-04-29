package com.overlanwest.app.util;

import org.mapstruct.Mapper;

import com.overlanwest.app.dto.users.response.UserResponse;
import com.overlanwest.app.models.User;

@Mapper (componentModel = "spring")
public interface UserMapstruct {

    
    UserResponse toDto(User user);
    
}
