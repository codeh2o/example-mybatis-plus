package com.example.mp;

import com.baomidou.mybatisplus.extension.api.Assert;
import com.example.mp.dao.Group;
import com.example.mp.dao.UserMapper;
import com.example.mp.entities.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @program: mp
 * @description:
 * @author: yetin
 * @create: 2020-07-31 13:22
 **/


@SpringBootTest
public class SimpleTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private Group group;


    @Test
    public void select(){
//        group.sayHello();
//
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }
}
