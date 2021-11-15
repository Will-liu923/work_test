package com.lw.test;

import com.lw.bean.AspectTest;
import com.lw.bean.User;
import com.lw.bean.UserDo;
import com.lw.bean.UserUse;
import com.lw.controller.AspectTestController;
import com.lw.service.TestAspectAnno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @className: Test
 * @author: wei.liu2mars@outlook.com  lw
 * @date: 2021/11/10 16:49
 **/
@SpringBootTest
public class Test {
    @Autowired
    private UserUse userUse;

    @Autowired
    private UserDo userDo;

    @Autowired
    private AspectTestController aspectTestController;

    @Autowired
    private AspectTest aspectTest;

    @Autowired
    private TestAspectAnno testAspectAnno;

    @org.junit.jupiter.api.Test
    public void test() {
        userUse.doSomething(1,2);
        System.out.println(userUse);
        User user = userUse.getUser();
        System.out.println(user);
    }

    @org.junit.jupiter.api.Test
    public void test1() {
        System.out.println(userDo);
    }


    @org.junit.jupiter.api.Test
    public void test2() {
        aspectTestController.aspect1("Jack",18);
    }

    @org.junit.jupiter.api.Test
    public void test3() {
        aspectTestController.aspect2();
    }

    @org.junit.jupiter.api.Test
    public void test4() {
        aspectTest.test(1,0);
    }

    @org.junit.jupiter.api.Test
    public void test5() {
        testAspectAnno.test1();
    }

    @org.junit.jupiter.api.Test
    public void test6() {
        testAspectAnno.test2();
    }
}
