package com.example.mp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mp.entities.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: mp
 * @description:
 * @author: h2o
 * @create: 2020-08-02 23:35
 **/
@Mapper
@Repository
public interface StudentMapper extends BaseMapper<Student> {
    public int insertStudent(Student student);
    public Student selectStudentById(Long id);
    public List<Student> selectByName(String name);
}
