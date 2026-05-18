package com.overlanwest.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.overlanwest.app.dto.role.request.CreateRoleRequest;
import com.overlanwest.app.dto.role.response.RoleResponse;
import com.overlanwest.app.models.Role;
import com.overlanwest.app.repositories.RoleRepositories;
import com.overlanwest.app.util.RoleMapstruct;



@Service
public class RoleSerive {
    
    @Autowired
    private RoleRepositories roleRepositories;

    @Autowired
    private RoleMapstruct roleMapstruct;


    @Transactional(readOnly = true)
    public Page<RoleResponse> getAllRole (Pageable pageable){
        return roleRepositories.findAll(pageable).map(roleMapstruct::toDto);
    }

    @Transactional
    public RoleResponse createNewRole (CreateRoleRequest createRoleRequest) {

        Role role = roleMapstruct.toEntity(createRoleRequest);

        System.out.print("NEW ROLE2 : " + createRoleRequest);
        Role saveRole = roleRepositories.save(role);

        return roleMapstruct.toDto(saveRole);
    }
}
