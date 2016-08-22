package com.charles.ua.dao.impl;

import com.charles.ua.dao.BaseDao;
import com.charles.ua.dao.UserDao;
import com.charles.ua.domain.pojo.User;
import org.springframework.stereotype.Component;

/**
 * Author: zhangyong
 * Date: 16/8/21
 */
@Component
public class UserDaoImpl extends BaseDao implements UserDao {

    public User get(Long id) {
        return sqlSession.selectOne("UserDao.get", id);
    }

}
