package com.usopp.controller;

import com.usopp.domain.Usopp;
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

    @RequestMapping("/")
    public String index() {
        return "hello world";
    }

    @RequestMapping("/getUser")
    public Usopp getUsopp(){
        return usopp;
    }

}
