package com.charles.ua.web.service.impl;

import com.charles.ua.manager.UserManager;
import com.charles.ua.domain.pojo.User;
import com.charles.ua.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author: zhangyong
 * Date: 16/8/22
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserManager userManager;

    public User get(Long id) {
        return userManager.get(id);
    }
}
