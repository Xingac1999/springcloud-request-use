package xyb.newbee.demo.servicedemo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyb.newbee.demo.servicedemo1.service.HelloServiceImpl;

@RestController
public class HelloServiceController {

    @Autowired
    private HelloServiceImpl helloService;

    @GetMapping("/hello")
    public String hello() {
        // 调用本地方法，并通过HTTP协议进行响应
        return "hello from " + helloService.getName();
    }
}
