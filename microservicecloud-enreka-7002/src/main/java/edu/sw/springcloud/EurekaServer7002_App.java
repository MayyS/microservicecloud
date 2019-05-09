package edu.sw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther:S
 * @Date:19/5/10
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002_App {
    public static void main(String[]args){

        SpringApplication.run(EurekaServer7002_App.class,args);
    }
}
