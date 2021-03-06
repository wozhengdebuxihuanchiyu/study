package com.yu;


import com.yu.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringCloudApplication
@EnableZuulProxy
public class SimpleZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleZuulApplication.class);
    }
    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }
}
