package com.cx.productclient.mapper;

import com.cx.productclient.config.FeignConfig;
import com.cx.productclient.config.HystrixConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
@FeignClient(value = "STUDENT-CLIENT",configuration = FeignConfig.class,fallback = HystrixConfig.class)
public interface StudentMapper {
    @GetMapping("/admin/{id}")
    String getStudent(@PathVariable("id") String id);
}
