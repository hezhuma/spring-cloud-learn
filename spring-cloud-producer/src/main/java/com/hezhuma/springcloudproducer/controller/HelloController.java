package com.hezhuma.springcloudproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heshixian
 * @version 1.0
 * @date 2020/5/25 15:56
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello "+name+"，producer is ready";
    }

}
