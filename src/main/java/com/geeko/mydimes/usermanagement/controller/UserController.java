package com.geeko.mydimes.usermanagement.controller;

import com.geeko.mydimes.usermanagement.entity.UserEntity;
import com.geeko.mydimes.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public ResponseEntity<?> addUser(UserEntity userEntity) {
        return new ResponseEntity<>(userService.addUser(userEntity), HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<?> findAllUsers() {
        return new ResponseEntity<>(userService.findAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> findUserById(UUID userId) {
        return new ResponseEntity<>(userService.findUserById(userId), HttpStatus.OK);
    }

    @DeleteMapping("")
    public void deleteAllUsers() {
        userService.deleteAllUsers();
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(UUID userId) {
        userService.deleteUser(userId);
    }
}
