package com.wyy.springbootdemo.entity;

import org.springframework.stereotype.Component;

/**
 * @author: Herion Lemon
 * @date: 2021/7/12 20:54
 * @slogan: 如果你想攀登高峰，切莫把彩虹当梯子
 * @description:
 */
//@Component
public class BeanDemo {
    public BeanDemo() {
        System.out.println("BeanDemo 开始创建...");
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
