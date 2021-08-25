package com.wyy.springbootdemo.service.impl;

import com.wyy.springbootdemo.entity.BeanDemo;
import org.springframework.stereotype.Component;

/**
 * @author: Herion Lemon
 * @date: 2021/7/12 22:08
 * @slogan: 如果你想攀登高峰，切莫把彩虹当梯子
 * @description:
 */
public class UserFactory {
    /**
     * 我最多能创建这个数量的{@link BeanDemo}
     */
    private int size;

    public UserFactory(int size) {
        System.out.println("UserFactory 开始创建...");
        this.size = size;
    }

    public BeanDemo createUser(){
        if(size >= 10){
            return null;
        }
        BeanDemo beanDemo = new BeanDemo();
        beanDemo.setName("张三"+size);
        size++;
        return beanDemo;
    }
}
