package edu.sw.springcloud.service;

import edu.sw.springcloud.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "provider-dept")
public interface DeptClientService {

    @RequestMapping(value ="/dept/get/{id}" ,method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id);


    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept);
}