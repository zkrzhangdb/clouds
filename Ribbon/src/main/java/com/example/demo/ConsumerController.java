package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class ConsumerController {

    @Autowired
    private ComputeService computeService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return computeService.addService();
    }

    @RequestMapping(value = "/from", method = RequestMethod.GET)
    public String from() {
        return computeService.fromService();
    }


    @RequestMapping(value = "/oasys", method = RequestMethod.GET)
    public String  aoaSys() {
        return computeService.oaService();
    }


}