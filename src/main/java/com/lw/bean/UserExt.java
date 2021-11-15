package com.lw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @className: UserExt
 * @description: TODO 类描述
 * @author: wei.liu2mars@outlook.com  lw
 * @date: 2021/11/10 17:26
 **/
@Component
public class UserExt extends User{
    @Value("${user.addr}")
    private String addr;

    @Value("#{user.name}")
    private String name;

    @Override
    public String toString() {
        return "UserExt{" +
                "addr='" + addr + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
