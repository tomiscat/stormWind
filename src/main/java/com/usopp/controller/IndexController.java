package com.usopp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fov on 2017/3/6.
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "hello world";
    }


}
