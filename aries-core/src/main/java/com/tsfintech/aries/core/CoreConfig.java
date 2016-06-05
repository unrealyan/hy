package com.tsfintech.aries.core;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tsfintech.aries.core.json.ObjectMapperBeanFactory;

@Configuration
@ComponentScan
@EnableJpaRepositories
@EntityScan("com.tsfintech.aries.core.model")
public class CoreConfig {

    @Bean
    public ObjectMapper objectMapper() {
        return ObjectMapperBeanFactory.getObjectMapper();
    }

}
