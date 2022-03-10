package com.geeko.mydimes.usermanagement.repository;

import com.geeko.mydimes.usermanagement.entity.RoleEntity;
import com.geeko.mydimes.usermanagement.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {
    Optional<UserEntity> findUserByUsername(String username);
}
