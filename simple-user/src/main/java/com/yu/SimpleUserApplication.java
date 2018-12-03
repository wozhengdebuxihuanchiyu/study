package com.yu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: yuchangying
 * @Date: 2018/11/26 11:38
 * @Description:
 * @Email yu.changying@trs.com.cn
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class SimpleUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleUserApplication.class);
    }
}
