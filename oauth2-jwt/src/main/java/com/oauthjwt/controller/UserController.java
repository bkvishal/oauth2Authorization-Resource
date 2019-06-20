package com.oauthjwt.controller;

import com.oauthjwt.model.Users;
import com.oauthjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : Vishal Srivastava
 * @Date : 14-06-2019
 **/

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder encoder;

    @PostMapping(value = "/add")
    public Users addUser(@RequestBody Users users){
        Users users1 = new Users();
        users1.setId(users.getId());
        users1.setUsername(users.getUsername());
        users1.setPassword(encoder.encode(users.getPassword()));
        users1.setAge(users.getAge());
        userRepository.save(users1);
        return users1;
    }

    @GetMapping(value = "/get")
    public List<Users> getAll() {
        return userRepository.findAll();
    }

}
