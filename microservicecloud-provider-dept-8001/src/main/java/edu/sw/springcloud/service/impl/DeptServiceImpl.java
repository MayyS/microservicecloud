package edu.sw.springcloud.service.impl;

import edu.sw.springcloud.dao.DeptDao;
import edu.sw.springcloud.entity.Dept;
import edu.sw.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;
    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        Dept dept=deptDao.findById(id);
        System.out.println(dept);
        return dept;
    }

    @Override
    public List<Dept> list()
    {
        return deptDao.findAll();
    }
}
