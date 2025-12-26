package com.test.gitdemo.service;

import com.test.gitdemo.model.User;

public class UserService {
    // 登录校验逻辑
    public boolean login(User user) {
        // 简单校验：用户名和密码非空且不为空字符串
        if (user.getUsername() == null || user.getUsername().trim().isEmpty()) {
            return false;
        }
        if (user.getPassword() == null || user.getPassword().trim().isEmpty()) {
            return false;
        }
        // 模拟正确的账号密码
        return "admin".equals(user.getUsername()) && "123456".equals(user.getPassword());
    }
}
