package com.example.mp.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: mp
 * @description:
 * @author: h2o
 * @create: 2020-08-03 00:52
 **/
@Configuration
public class Config {
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
