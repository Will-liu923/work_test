package com.lw.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: AspectTestController
 * @description: TODO 类描述
 * @author: wei.liu2mars@outlook.com  lw
 * @date: 2021/11/15 10:41
 **/
@RestController
public class AspectTestController {

    @PostMapping("/aspect1")
    public String aspect1(String name, Integer age) {
        System.out.println("目标方法执行了");
        return "Hello World!!!";
    }

    @PostMapping("/aspect2")
    public void aspect2() {
        System.out.println("目标方法执行了");
    }
}
