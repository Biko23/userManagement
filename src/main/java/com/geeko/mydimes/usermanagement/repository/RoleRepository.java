package com.geeko.mydimes.usermanagement.repository;

import com.geeko.mydimes.usermanagement.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<RoleEntity, UUID> {
    RoleEntity findRoleByName(String name);
}
