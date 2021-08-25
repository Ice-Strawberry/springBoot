package com.wyy.springbootdemo.config;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author: Herion Lemon
 * @date: 2021/7/12 20:47
 * @slogan: 如果你想攀登高峰，切莫把彩虹当梯子
 * @description: 配置类，标注@Configuration注解
 */
@Component
public class IocConfig {
    public IocConfig() {
        System.out.println("IocConfig 创建中...");
    }
}
