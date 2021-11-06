package com.bozhi.pms.controller;

import com.bozhi.pms.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoController
 * @Description TODO
 * @Author 玛卡巴卡
 * @Date 2021/11/5 20:45
 * @Version 1.0
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/test")
    public String test(){
        return "Hello,World!";
    }
}
