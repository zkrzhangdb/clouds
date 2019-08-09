package com.example.demo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.awt.print.Book;

@Service
public class ComputeService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService() {
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
    }


    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String fromService() {
        return restTemplate.getForEntity("http://dis/from", String.class).getBody();
    }


    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String oaService() {
        return restTemplate.getForEntity("http://sys-service/login", String.class).getBody();
    }


    public String addServiceFallback() {
        return "error";
    }

}