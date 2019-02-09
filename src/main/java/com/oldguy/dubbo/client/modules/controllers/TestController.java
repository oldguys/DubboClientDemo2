package com.oldguy.dubbo.client.modules.controllers;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.services.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2019/2/6 0006
 * @Author: ren
 * @Description:
 */
@RestController
public class TestController {

    @Reference
    private TestService testService;

    @GetMapping("")
    public String test(){
        return testService.getMessage("test");

//        return "test";
    }
}
