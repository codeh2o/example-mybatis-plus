package com.example.mp.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: mp
 * @description:
 * @author: h2o
 * @create: 2020-08-02 23:34
 **/
@Getter
@Setter
@ToString
public class Student {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Integer status;
}
