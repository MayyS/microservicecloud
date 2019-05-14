package edu.sw.ribbon;

import com.netflix.loadbalancer.IRule;
import edu.sw.ribbon.solution.Romdom_5;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRule {

    @Bean
    public IRule myRule(){
        return new Romdom_5();
    }
}
