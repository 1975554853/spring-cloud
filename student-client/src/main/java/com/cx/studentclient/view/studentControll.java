package com.cx.studentclient.view;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class studentControll {
    @Value(("${server.port}"))
    private String port;

    @GetMapping("/{id}")
    public String get(@PathVariable("id") String id) {
        return "你访问的是学生管理模块，端口是" + port + "传进来的id是" + id;
    }
}
