package com.geeko.mydimes.usermanagement.service;

import com.geeko.mydimes.usermanagement.entity.MyUserDetails;
import com.geeko.mydimes.usermanagement.entity.UserEntity;
import com.geeko.mydimes.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserEntity> userEntity = userRepository.findUserByUsername(username);

        userEntity.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username));

        return userEntity.map(MyUserDetails::new).get();
    }
}
