package com.lw.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @className: UserUse
 * @description: TODO 类描述
 * @author: wei.liu2mars@outlook.com  lw
 * @date: 2021/11/10 16:46
 **/
@Component
public class UserUse {
    static {
        System.out.println(1111);
    }

    //@Autowired作用在非setter成员方法上，会在类加载是自动执行一次
    @Autowired
    public void fn() {
        System.out.println(2222);
    }

    //@Autowired作用在成员变量上，会自动注入user
    private User user;

    //@Autowired作用在有参构造方法上，会自动注入user
   /* @Autowired
    public UserUse(User user) {
        this.user = user;
    }*/

    public void doSomething(int a, int b) {
        System.out.println(a + b);
    }

    @Override
    public String toString() {
        return "UserUse{" +
                "user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    //@Autowired作用在setter方法上，自动注入user
    @Autowired
    public void setUser(User user) {
        this.user = user;
    }
}
