package com.jsonmack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
/**
 * @author Jason MacKeigan
 */
@SpringBootApplication
@EntityScan(basePackages = "com.jsonmack.entity")
@PropertySource("classpath:application.yml")
public class JsonMackApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsonMackApplication.class, args);
    }

}
