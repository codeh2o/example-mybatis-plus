package com.example.mp;

import com.baomidou.mybatisplus.extension.api.Assert;
import com.example.mp.dao.Group;
import com.example.mp.dao.UserMapper;
import com.example.mp.entities.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    public void select(){
//        group.sayHello();
//
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }
    @Test
    public void insert(){
        User user = new User();
        user.setAge(31);
        user.setEmail("id@ds.com");
        user.setManagerId(1088248166370832385L);
        user.setName("刘明强");
        user.setCreateTime(LocalDateTime.now());
        int row = userMapper.insert(user);
        log.info(String.valueOf(user.getId()));
    }

    @Test
    public void update(){
        User user = new User();

        user.setName("刘1明1强");
        user.setId(1289776760195452930L);
        int i = userMapper.updateById(user);
        log.info(String.valueOf(i));
    }

    @Test
    public void delete(){
        int i = userMapper.deleteById(1289776760195452930L);
        log.info(String.valueOf(i));
    }

    @Test
    public void deleteByCondition(){
        Map<String, Object> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("name","刘明强");

        int i = userMapper.deleteByMap(stringIntegerMap);
        log.info(String.valueOf(i));
    }

    @Test
    public void deleteBatch(){
        List<Long> collect = Stream.of(1, 2,  4, 5).map(Long::valueOf).collect(Collectors.toList());


        ArrayList<Long> ids = new ArrayList<>();
        ids.add(1289900950017908737L);
        ids.add(1289900976605544450L);
        int i = userMapper.deleteBatchIds(ids);
        log.info(String.valueOf(i));
    }

    @Test
    public void selectById(){
        User user = userMapper.selectById(1094590409767661570L);
        log.info(String.valueOf(user));
    }

    @Test
    public void selectByBatchId(){
        List<Long> collect = Stream.of(1088250446457389058L, 1094590409767661570L).map(Long::valueOf).collect(Collectors.toList());
        List<User> users = userMapper.selectBatchIds(collect);
        log.info(String.valueOf(users));
    }

    @Test
    public void selectByBatchMap(){
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("name","王天风");
        stringObjectHashMap.put("age",25);
        List<User> users = userMapper.selectByMap(stringObjectHashMap);
        log.info(String.valueOf(users));
    }
}
