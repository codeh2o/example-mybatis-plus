package com.example.mp;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.example.mp.dao.DeptMapper;
import com.example.mp.entities.Dept;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @program: mp
 * @description:
 * @author: h2o
 * @create: 2020-08-02 22:49
 **/
@SpringBootTest
public class ActiveRecordTest {
    @Autowired
    private DeptMapper deptMapper;

    @Test
    public void insertTest(){
        Dept dept = new Dept();
        dept.setName("销售部");
        dept.setMobile("13535445321");
        dept.setManagerId(1L);
        boolean insert = dept.insert();
        System.out.println(insert);

    }

    @Test
    public void updateTest(){
        Dept dept = new Dept();
        dept.setMobile("010-12345678");
        dept.setName("市场部");
        dept.setManagerId(2L);
        dept.setId(1L);
        boolean b = dept.updateById();
        System.out.println(b);
    }

    @Test
    public void update2Test(){
        Dept dept = new Dept();
        dept.setMobile("010-3333");

        dept.setId(1L);
        boolean b = dept.updateById();
        System.out.println(b);
    }

    @Test
    public void deleteByidTest(){
        int i = deptMapper.deleteById(3l);
        System.out.println(i);


    }


    @Test
    public void selectByIdTest(){
        Dept dept = deptMapper.selectById(2l);

        System.out.println(dept);


    }

    @Test
    public void selectById2Test(){
        Dept dept1 = new Dept();
        dept1.setId(2l);
        Model model = dept1.selectById();

        System.out.println(model);


    }
}


