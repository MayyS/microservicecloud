package edu.sw.springcloud;

import edu.sw.ribbon.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "provider-dept",configuration = MyRule.class)
public class DeptConsumer80_App {

    public static void main(String[]args){
        SpringApplication.run(DeptConsumer80_App.class,args);
    }
}
