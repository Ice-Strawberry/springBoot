package com.wyy.springbootdemo.controller;

import com.wyy.springbootdemo.entity.BeanDemo;
import com.wyy.springbootdemo.service.UserService;
import com.wyy.springbootdemo.service.impl.UserFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author: Herion Lemon
 * @date: 2021/7/12 21:18
 * @slogan: 如果你想攀登高峰，切莫把彩虹当梯子
 * @description:
 */
@Controller
public class WyyController {
    @Autowired
    UserService userService;
    @Autowired
    UserFactory userFactory;
}
