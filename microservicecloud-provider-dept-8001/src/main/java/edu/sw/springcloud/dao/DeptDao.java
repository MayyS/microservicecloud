package edu.sw.springcloud.dao;

import edu.sw.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {

    boolean addDept(Dept dept);

    Dept findById(Long deptNo);

    List<Dept> findAll();
}
