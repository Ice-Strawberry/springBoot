package com.wyy.springbootdemo.service.impl;

import com.wyy.springbootdemo.entity.BeanDemo;
import com.wyy.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @author: Herion Lemon
 * @date: 2021/7/12 21:08
 * @slogan: 如果你想攀登高峰，切莫把彩虹当梯子
 * @description:
 */

/**
 * @Component：让spring扫描包时把当前类扫入，注册到beanDefinitionMap中
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserFactory userFactory;

    public UserServiceImpl() {
        System.out.println(UserServiceImpl.class+" 创建中...");
    }

    @Override
    public void helloWorld() {
        System.out.println("hello world!wyy!");
    }
}
