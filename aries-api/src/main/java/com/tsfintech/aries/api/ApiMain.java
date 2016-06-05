package com.tsfintech.aries.api;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import com.tsfintech.aries.core.CoreConfig;

import javax.validation.Validation;
import javax.validation.Validator;

@SpringBootApplication
@Import(CoreConfig.class)
public class ApiMain {

    public static void main(String[] args) {
        SpringApplication.run(ApiMain.class, args);
    }

    @Bean
    public Mapper dozerBeanMapper() {
        Mapper mapper = new DozerBeanMapper();

        return mapper;
    }

    @Bean
    public Validator validator() {
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

        return validator;
    }

}
