package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo01 {
    @RequestMapping("/show")
    public String show(){
        System.out.println("高尚者的墓志铭");
        return "hello springboot";
    }
}
