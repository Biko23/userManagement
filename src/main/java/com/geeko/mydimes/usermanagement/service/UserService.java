package com.geeko.mydimes.usermanagement.service;

import com.geeko.mydimes.usermanagement.entity.UserEntity;
import com.geeko.mydimes.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity addUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    public List<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }

    public Optional<UserEntity> findUserById(UUID userId) {
        return userRepository.findById(userId);
    }

    public void deleteUser(UUID userId) {
        userRepository.deleteById(userId);
    }

    public void deleteAllUsers() {
        userRepository.deleteAll();
    }
}
