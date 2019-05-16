package edu.sw.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import edu.sw.springcloud.entity.Dept;
import edu.sw.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id){
        Dept dept=this.service.get(id);
        if(null==dept){
            throw new RuntimeException("fail");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id")Long id){
        Dept dept=new Dept("0000000000");
        return dept;
    }

}
