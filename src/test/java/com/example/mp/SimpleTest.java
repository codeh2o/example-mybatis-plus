package com.example.mp;



import com.example.mp.entity.User;
import com.example.mp.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @program: mp
 * @description:
 * @author: yetin
 * @create: 2020-07-31 13:22
 **/


@SpringBootTest
@Slf4j
public class SimpleTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void delete(){
        int i = userMapper.deleteById(1094590409767661570L);
        System.out.println(i);
    }

    @Test
    public void insert(){
        User user = new User();
        user.setAge(32);
        user.setName("习近平2");
        user.setEmail("test@test.com");
        user.setManagerId(1088248166370832385L);
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }

    @Test
    public void update(){
        User user = new User();
        user.setAge(33);
        userMapper.updateById(user);
    }

    @Test
    public void select(){

        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    public void updateOptimistic(){
        int version =1;
        User user = new User();
        user.setAge(33);
        user.setId(1291980458711613441L);
        user.setVersion(version);
        userMapper.updateById(user);

    }

    @Test
    public void deleteXML(){
        userMapper.deleteById(1291975872626044929L);
    }

}
