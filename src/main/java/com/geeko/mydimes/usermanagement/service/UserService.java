package com.geeko.mydimes.usermanagement.service;

import com.geeko.mydimes.usermanagement.entity.RoleEntity;
import com.geeko.mydimes.usermanagement.entity.UserEntity;
import com.geeko.mydimes.usermanagement.repository.RoleRepository;
import com.geeko.mydimes.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        UserEntity userEntity = userRepository.findUserByUsername(username);
//        if (userEntity == null) {
//            throw new UsernameNotFoundException("User not found");
//        } else {
////            log
//        }
//        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
//        userEntity.getRoles().forEach(roleEntity -> {
//            authorities.add(new SimpleGrantedAuthority(roleEntity.getName()));
//        });


        //User below is from org.springframework.security.core.userDetails.User()
//        return new User(userEntity.getEmail(), userEntity.getPassword(), authorities);
//    }

    public UserEntity addUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

//    public void addRoleToUser (String roleName, String userName) {
//        UserEntity user = userRepository.findUserByName(userName);
//        RoleEntity role = roleRepository.findRoleByName(roleName);
//        user.getRoles().add(role);
//    }

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
