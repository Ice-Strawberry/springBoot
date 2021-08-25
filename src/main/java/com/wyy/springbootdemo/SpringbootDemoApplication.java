package com.wyy.springbootdemo;

import com.wyy.springbootdemo.service.impl.SpringIOCContext;
import com.wyy.springbootdemo.service.impl.UserFactory;
import com.wyy.springbootdemo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 */
@SpringBootApplication
public class SpringbootDemoApplication {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Object o = Class.forName("com.wyy.springbootdemo.service.impl.UserServiceImpl").newInstance(); // 等同于 new UserServiceImpl()
        System.out.println((UserServiceImpl)o);
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }
}
