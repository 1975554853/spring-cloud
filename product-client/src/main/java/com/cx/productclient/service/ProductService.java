package com.cx.productclient.service;

import com.cx.productclient.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    StudentMapper studentMapper;

    public String getStudentName(String id){
        return studentMapper.getStudent(id);
    }
}
