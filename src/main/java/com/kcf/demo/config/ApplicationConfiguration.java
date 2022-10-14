package com.kcf.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.annotation.ManagedBean;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public RestTemplate restTemplate()
    {
    return new RestTemplate();
    }
}
