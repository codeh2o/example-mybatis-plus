package com.example.mp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mp.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @program: mp
 * @description:
 * @author: yetin
 * @create: 2020-07-31 13:20
 **/
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
}
