package com.liftChina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.yml")
@SpringBootApplication
public class SpringBootWebfluxJjwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebfluxJjwtApplication.class, args);
    }
}
