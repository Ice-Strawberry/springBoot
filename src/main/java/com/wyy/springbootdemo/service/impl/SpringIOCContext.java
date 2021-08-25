package com.wyy.springbootdemo.service.impl;

import com.wyy.springbootdemo.entity.BeanDemo;
import com.wyy.springbootdemo.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author: Herion Lemon
 * @date: 2021/7/12 21:11
 * @slogan: 如果你想攀登高峰，切莫把彩虹当梯子
 * @description: 如何读取spring容器中的类？
 * {@link ApplicationContextAware#setApplicationContext(ApplicationContext)}这个方法的作用：让你能够获得spring context上下文
 */
@Service
public class SpringIOCContext implements ApplicationContextAware {
    @Autowired
    UserService userService;
    public ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        UserService bean = this.applicationContext.getBean(UserService.class);
        bean.helloWorld();
    }
}
