package com.healthrecord.healthrecord.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SecurityConfig {
    @Value("${cors.allowedMethods}")
    private String[] allowedMethods;

    @Value("${cors.allowedHeaders}")
    private String[] allowedHeaders;

    @Value("${cors.allowedOrigins}")
    private String[] allowedOrigins;

    @Value("${cors.Configuration}")
    private String corsConfiguration;


    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping(corsConfiguration)
                        .allowedOrigins(allowedOrigins)
                        .allowedHeaders(allowedMethods)
                        .allowedMethods(allowedHeaders);
            }
        };
    }
}
