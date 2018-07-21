package com.cx.productclient.view;

import com.cx.productclient.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sell")
public class ProductControll {

    @Value("${server.port}")
    private String port;

    @Autowired
    ProductService productService;

    @GetMapping("/{id}")
    public String getSellAndStudent(@PathVariable("id") String id){
        return "1.访问了product系统,端口号为 : "+port+"  ; 2."+productService.getStudentName(id);
    }
    @GetMapping("/me")
    public String get(){
        return "sdfsdf";
    }

}
