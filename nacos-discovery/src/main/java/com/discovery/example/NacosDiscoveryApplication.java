package com.discovery.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhujianxin
 * @date 2018/11/13.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryApplication.class,args);
    }

//
    @RestController
    public class TestController{
        @RequestMapping(value = "/hello/{value}")
        public String test(@PathVariable String value){
            return "hello I'm " + value;
        }
    }
}
