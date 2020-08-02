package com.example.mp.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: mp
 * @description:
 * @author: h2o
 * @create: 2020-08-02 22:43
 **/
@Getter
@Setter
@ToString
public class Dept extends Model {
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    private String mobile;
    private Long managerId;
}
