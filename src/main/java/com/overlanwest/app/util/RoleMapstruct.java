package com.overlanwest.app.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.overlanwest.app.dto.role.request.CreateRoleRequest;
import com.overlanwest.app.dto.role.response.RoleResponse;
import com.overlanwest.app.models.Role;

@Mapper(componentModel = "spring")
public interface RoleMapstruct {
    
    @Mapping(target = "roleName", source = "role.rolename")
    RoleResponse toDto(Role role);

    


    Role toEntity (CreateRoleRequest createRoleRequest);
   
}
