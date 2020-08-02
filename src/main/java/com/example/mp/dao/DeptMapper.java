package com.example.mp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mp.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @program: mp
 * @description:
 * @author: h2o
 * @create: 2020-08-02 22:47
 **/
@Mapper
@Repository
public interface DeptMapper extends BaseMapper<Dept> {
}
