package com.charles.ua.manager.impl;

import com.charles.ua.dao.UserDao;
import com.charles.ua.manager.UserManager;
import com.charles.ua.domain.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author: zhangyong
 * Date: 16/8/22
 */
@Component
public class UserManagerImpl implements UserManager {

    @Autowired
    private UserDao userDao;

    public User get(Long id) {
        return userDao.get(id);
    }
}
