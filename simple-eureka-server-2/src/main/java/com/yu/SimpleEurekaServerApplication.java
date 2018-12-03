package com.yu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Auther: yuchangying
 * @Date: 2018/11/26 11:38
 * @Description:
 * @Email yu.changying@trs.com.cn
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class SimpleEurekaServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(SimpleEurekaServerApplication.class);
    }
}
