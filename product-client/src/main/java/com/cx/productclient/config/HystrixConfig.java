package com.cx.productclient.config;

import com.cx.productclient.mapper.StudentMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HystrixConfig implements StudentMapper {
    @Override
    public String getStudent(String id) {

        return"失败";
    }
}
