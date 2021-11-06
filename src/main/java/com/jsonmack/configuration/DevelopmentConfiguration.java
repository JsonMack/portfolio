package com.jsonmack.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Jason MacKeigan
 */
@Configuration
@Profile("development")
public class DevelopmentConfiguration {

}
