package com.hezhuma.springcloudconsumers.controller;

import com.hezhuma.springcloudconsumers.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heshixian
 * @version 1.0
 * @date 2020/5/25 16:29
 */
@RestController
public class HelloController {
    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }
}
