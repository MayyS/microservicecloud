package edu.sw.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther:S
 * @Date:19/5/10
 */

@NoArgsConstructor
//@AllArgsConstructor
@Data
@Accessors(chain=true)
@ToString
public class Dept implements Serializable {
    private int deptNo;
    private String deptName;
    private String dbSource;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname)
    {
        super();
        this.deptName = dname;
    }



}
