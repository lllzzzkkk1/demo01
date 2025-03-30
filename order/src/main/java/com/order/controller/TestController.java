package com.order.controller;/*@date 2025-03-09-下午5:37
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @Autowired
    private  ApplicationContext applicationContext;


    @GetMapping("/test01")
    public String test(){

        //获取服务端口
        String port = applicationContext.getEnvironment().getProperty("server.port");

        return "order 被调用的服务端口"+port;



    }
}
