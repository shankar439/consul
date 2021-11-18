package com.client.clientServer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class MyController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;

    Logger log = LoggerFactory.getLogger(MyController.class);

    @RequestMapping("/print")
    public String welcomeFromServer() {
        log.info("hello world log message");
        URI uri = discoveryClient.getInstances("welcome").stream().map(si -> si.getUri()).findFirst()
                .map(s -> s.resolve("/welcome")).get();
        return restTemplate.getForObject(uri, String.class);
    }
}
