package com.offcn.springcloud.controller;

import com.offcn.springcloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController_Consumer {
    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL="http://MICROSERVICE-PRODUCT";

    @RequestMapping("/consumer/showUser/{uid}")
    public User get(@PathVariable("uid") Integer uid){
        return restTemplate.getForObject(REST_URL+"/showUser/{uid}",User.class,uid);
    }

    @RequestMapping("/consumer/showList")
    public List<User> list(){
        return restTemplate.getForObject(REST_URL + "/showList", List.class);
    }
}
