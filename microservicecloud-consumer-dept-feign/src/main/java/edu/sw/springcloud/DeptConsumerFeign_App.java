package edu.sw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"edu.sw.springcloud"})
//@ComponentScan("edu.sw.springcloud")
public class DeptConsumerFeign_App {

    public static void main(String[]args){
        SpringApplication.run(DeptConsumerFeign_App.class,args);
    }
}
