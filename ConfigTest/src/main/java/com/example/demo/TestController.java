package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class TestController {

    @Value("${from}")
    private String from;


    @Autowired
    private DiscoveryClient client;


    @RequestMapping("/from")
    public String from() {

        ServiceInstance instance = client.getLocalServiceInstance();
        System.out.println("Host"+instance.getHost());
        System.out.println("ServiceId"+instance.getServiceId());
        return this.from;
}






}