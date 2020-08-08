package com.example.mp.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @program: mp
 * @description:
 * @author: h2o
 * @create: 2020-08-08 13:49
 **/
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        boolean hasSetter = metaObject.hasSetter("createTime");
        Object createTime = getFieldValByName("createTime", metaObject);
        if (hasSetter&&createTime==null) {
            this.strictInsertFill(metaObject, "createTime", LocalDateTime.class, LocalDateTime.now());
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        boolean hasSetter = metaObject.hasSetter("updateTime");
        Object updateTime = getFieldValByName("updateTime", metaObject);
        if (hasSetter&&updateTime==null) {
            this.fillStrategy(metaObject, "updateTime", LocalDateTime.now());
        }
    }
}
