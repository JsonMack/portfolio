package com.jsonmack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Jason MacKeigan
 */
@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = "com.jsonmack.entity")
@PropertySource("classpath:application.yml")
public class JsonMackApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsonMackApplication.class, args);
    }

}
