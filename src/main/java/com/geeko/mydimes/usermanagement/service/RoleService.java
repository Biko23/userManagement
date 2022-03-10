package com.geeko.mydimes.usermanagement.service;

import com.geeko.mydimes.usermanagement.entity.RoleEntity;
import com.geeko.mydimes.usermanagement.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public RoleEntity addRole(RoleEntity roleEntity) {
        return roleRepository.save(roleEntity);
    }

//    public void addRoleToRole (String roleName, String roleName) {
//        RoleEntity role = roleRepository.findRoleByName(roleName);
//        RoleEntity role = roleRepository.findRoleByName(roleName);
//        role.getRoles().add(role);
//    }

    public List<RoleEntity> findAllRoles() {
        return roleRepository.findAll();
    }

    public Optional<RoleEntity> findRoleById(UUID roleId) {
        return roleRepository.findById(roleId);
    }

    public void deleteRole(UUID roleId) {
        roleRepository.deleteById(roleId);
    }

    public void deleteAllRoles() {
        roleRepository.deleteAll();
    }
}
