package com.lw.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @className: UserUnuse
 * @description: TODO 类描述
 * @author: wei.liu2mars@outlook.com  lw
 * @date: 2021/11/10 17:22
 **/
@Component
public class UserDo {
    private User[] users;
    private Map<String,User> userMap;
    private List<User> userList;

    @Autowired
    public UserDo(User[] users, Map<String, User> userMap, List<User> userList) {
        this.users = users;
        this.userMap = userMap;
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "UserDo{" +
                "users=" + Arrays.toString(users) +
                ", userMap=" + userMap +
                ", userList=" + userList +
                '}';
    }
}
