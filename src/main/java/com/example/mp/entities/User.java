package com.example.mp.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @program: mp
 * @description:
 * @author: yetin
 * @create: 2020-07-31 13:16
 **/
@Getter
@Setter
@ToString
public class User {
    private Long id;
    private String name;
    private Long age;
    private String email;
    private Long managerId;
    private LocalDateTime create_time;
}
