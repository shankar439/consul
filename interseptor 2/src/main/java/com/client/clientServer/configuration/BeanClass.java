package com.client.clientServer.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BeanClass {
    @Bean
    public RestTemplate restTemplateObj() {
        return new RestTemplate();
    }
}
