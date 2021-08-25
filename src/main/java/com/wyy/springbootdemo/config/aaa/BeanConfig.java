package com.wyy.springbootdemo.config.aaa;

import com.wyy.springbootdemo.entity.BeanDemo;
import com.wyy.springbootdemo.service.impl.UserFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Herion Lemon
 * @date: 2021/7/12 20:53
 * @slogan: 如果你想攀登高峰，切莫把彩虹当梯子
 * @description:
 */

/**
 * @ComponentScan：扫描当前标注了此注解的类，以及他当前同级目录下及其子目录
 */
@Configuration
public class BeanConfig {
    public BeanConfig() {
        System.out.println("BeanConfig 创建中...");
    }

    /**
     * @Bean：也是将类放入到ioc容器中，但是可以将创建bean的逻辑交给开发人员
     */
    @Bean
    public UserFactory aaa(){
        System.out.println("@Configuration开始加载 BeanDemo...");
        //如果我启动的端口号是8080  那么我就给UserFactory设置一个参数8080
        return new UserFactory(10);
    }
}
