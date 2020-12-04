package com.bsoh.v1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController{

    @RequestMapping("/")
    public String rootTest(){
        return "hello you are root here";
    }

    @RequestMapping("/v1")
    public String getV1(){
        return "hello you are root here v1";
    }
}