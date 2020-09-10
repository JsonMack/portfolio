package com.jsonmack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

/**
 * @author Jason MacKeigan
 */
@SpringBootApplication(exclude = {
        HibernateJpaAutoConfiguration.class,
        DataSourceAutoConfiguration.class
})
public class JsonMackApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsonMackApplication.class, args);
    }

}
