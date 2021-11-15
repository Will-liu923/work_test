package com.lw.service;

import com.lw.annotation.MyDesc;
import org.springframework.stereotype.Component;

/**
 * @className: TestAspectAnno
 * @description: TODO 类描述
 * @author: wei.liu2mars@outlook.com  lw
 * @date: 2021/11/15 13:59
 **/
@Component
public class TestAspectAnno {
    @MyDesc(describe = "Hello World!!!")
    public void test1() {
        System.out.println("带有@MyDesc注解的目标方法执行了");
    }

    public void test2() {
        System.out.println("不带@MyDesc注解的目标方法执行了");
    }
}
