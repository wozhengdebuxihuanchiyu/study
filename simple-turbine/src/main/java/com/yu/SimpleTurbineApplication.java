package com.yu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;


@SpringBootApplication
@EnableTurbine
public class SimpleTurbineApplication {



    public static void main(String[] args) {
        SpringApplication.run(SimpleTurbineApplication.class);
    }
}
