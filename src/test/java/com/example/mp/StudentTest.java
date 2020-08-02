package com.example.mp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mp.dao.DeptMapper;
import com.example.mp.dao.StudentMapper;
import com.example.mp.entities.Dept;
import com.example.mp.entities.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;

/**
 * @program: mp
 * @description:
 * @author: h2o
 * @create: 2020-08-02 22:49
 **/
@SpringBootTest
public class StudentTest {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void insertTest() {
        Student student = new Student();
        student.setAge(21);
        student.setEmail("ytlreal@gq.com");
        student.setName("lili");
        int i = studentMapper.insertStudent(student);
        System.out.println(i);

    }


    @Test
    public void selectTest() {

        Student student = studentMapper.selectStudentById(1L);
        System.out.println(student);

    }

    @Test
    public void testAllEq() {
        QueryWrapper<Student> studentQueryWrapper = new QueryWrapper<>();
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("name", "张三");
        stringObjectHashMap.put("age", null);
        studentQueryWrapper.allEq(stringObjectHashMap, false);
        List<Student> students = studentMapper.selectList(studentQueryWrapper);
        System.out.println(students);
    }

    @Test
    public void testEq() {
        QueryWrapper<Student> studentQueryWrapper = new QueryWrapper<>();
        studentQueryWrapper.eq("name", "李四");
        List<Student> students = studentMapper.selectList(studentQueryWrapper);
        System.out.println(students);
    }

    @Test
    public void testNe() {
        QueryWrapper<Student> studentQueryWrapper = new QueryWrapper<>();
        studentQueryWrapper.ne("name", "李四");
        List<Student> students = studentMapper.selectList(studentQueryWrapper);
        System.out.println(students);
    }

    @Test
    public void testGt() {
        QueryWrapper<Student> studentQueryWrapper = new QueryWrapper<>();
        studentQueryWrapper.gt("age", "22")
                .or()
                .eq("name", "李四")
                .last("limit 2");
        List<Student> students = studentMapper.selectList(studentQueryWrapper);
        System.out.println(students);
    }

    @Test
    public void testBetween() {
        QueryWrapper<Student> studentQueryWrapper = new QueryWrapper<>();
        studentQueryWrapper.orderBy(false, true, "age");
        List<Student> students = studentMapper.selectList(studentQueryWrapper);
        System.out.println(students);
    }

    @Test
    public void page() {
        QueryWrapper<Student> studentQueryWrapper = new QueryWrapper<>();
        IPage<Student> studentPage = new Page<>();
        studentPage.setCurrent(1);
        studentPage.setSize(3);
        IPage<Student> result = studentMapper.selectPage(studentPage, studentQueryWrapper);
        List<Student> records = result.getRecords();
        System.out.println(records);
        long pages = result.getPages();
        System.out.println(pages);
        long total = result.getTotal();
        System.out.println(total);

    }




}


