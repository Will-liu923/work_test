package com.lw.bean;

import org.springframework.stereotype.Component;

/**
 * @className: AspectTest
 * @description: TODO 类描述
 * @author: wei.liu2mars@outlook.com  lw
 * @date: 2021/11/15 11:04
 **/
@Component
public class AspectTest {
    public String test(Integer a, Integer b) {
        return String.valueOf(a / b);
    }
}
