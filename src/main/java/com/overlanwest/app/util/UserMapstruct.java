package com.overlanwest.app.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.overlanwest.app.dto.users.request.CreateUserRequest;
import com.overlanwest.app.dto.users.response.UserResponse;
import com.overlanwest.app.models.User;

@Mapper (componentModel = "spring")
public interface UserMapstruct {

    @Mapping(target = "roleName", source = "role.rolename")
    UserResponse toDto(User user);
    

    User toEntity(CreateUserRequest createUserRequest);
}
