package com.hezhuma.springcloudconsumers.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author heshixian
 * @version 1.0
 * @date 2020/5/25 16:27
 */
@FeignClient(name = "spring-cloud-producer")
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
