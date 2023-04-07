package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Dconfig {
    @Bean
    public Car getCar(){
        return new Car();
    }
}
