package com.charles.ua.web.service.impl;

import com.charles.ua.manager.UserManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Author: zhangyong
 * Date: 16/8/22
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-context.xml"})
public class UserServiceImplTest {

    @Autowired
    private UserManager userManager;

    @Test
    public void get() throws Exception {
        System.out.println(userManager.get(1L));
    }

}