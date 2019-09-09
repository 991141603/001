package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo01 {
    @RequestMapping("/show")
    public String show(){
        System.out.println("卑鄙是卑鄙者的通行证");
        System.out.println("卑鄙是卑鄙者的通行证");
        System.out.println("卑鄙是卑鄙者的通行证");
        System.out.println("卑鄙是卑鄙者的通行证");
        return "hello springboot";
    }
}
