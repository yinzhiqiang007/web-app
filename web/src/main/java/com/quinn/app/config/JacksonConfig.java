package com.quinn.app.config;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Configuration
public class JacksonConfig {


    @Bean
    public Jackson2ObjectMapperBuilderCustomizer customJackson() {
        return new Jackson2ObjectMapperBuilderCustomizer() {
            @Override
            public void customize(Jackson2ObjectMapperBuilder jacksonObjectMapperBuilder) {
                jacksonObjectMapperBuilder.serializationInclusion(JsonInclude.Include.NON_NULL);
                jacksonObjectMapperBuilder.failOnUnknownProperties(false);
                jacksonObjectMapperBuilder.propertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
            }

        };
    }

}
