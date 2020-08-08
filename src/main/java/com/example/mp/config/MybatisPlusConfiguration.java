package com.example.mp.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: mp
 * @description:
 * @author: h2o
 * @create: 2020-08-08 13:20
 **/
@Configuration
public class MybatisPlusConfiguration {
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor(){
        return  new OptimisticLockerInterceptor();
    }

}
