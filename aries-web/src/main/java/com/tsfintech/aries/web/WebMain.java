package com.tsfintech.aries.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.tsfintech.aries.core.CoreConfig;

@SpringBootApplication
@Import(CoreConfig.class)
public class WebMain {

    public static void main(String[] args) {
        SpringApplication.run(WebMain.class, args);
    }

}
