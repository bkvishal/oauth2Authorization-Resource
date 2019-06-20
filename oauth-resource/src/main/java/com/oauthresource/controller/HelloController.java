package com.oauthresource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Vishal Srivastava
 * @Date : 15-06-2019
 **/

@RestController
@RequestMapping(value = "/api")
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello you are into the resource serve";
    }

}
