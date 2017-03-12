package com.usopp.controller;

import com.usopp.domain.User;
import com.usopp.domain.Usopp;
import com.usopp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * usopp bean
 * Created by fov on 2017/3/6.
 */
@RestController
public class IndexController {

    @Autowired
    private Usopp usopp;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String index() {
        return "hello world";
    }

    @RequestMapping("/getUsopp")
    public Usopp getUsopp(){
        return usopp;
    }

    @RequestMapping("/getUser")
    public User getUser(){
        return userRepository.findByUserName("fov");
    }

}
