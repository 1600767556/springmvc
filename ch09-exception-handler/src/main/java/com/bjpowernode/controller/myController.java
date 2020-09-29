package com.bjpowernode.controller;

import com.bjpowernode.exception.AgeException;
import com.bjpowernode.exception.MyUserException;
import com.bjpowernode.exception.NameException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller

public class myController {

    @RequestMapping(value = "some.do")
    public ModelAndView doSome(String name,Integer age) throws MyUserException {
        ModelAndView modelAndView = new ModelAndView();

        if (!"zs".equals(name)){
            throw new NameException("姓名不正确!!");
        }
        if (age == null  || age>=80){
            throw new AgeException("年龄比较大");
        }

        modelAndView.addObject("myname",name);
        modelAndView.addObject("myage",age);

        modelAndView.setViewName("show");
        return modelAndView;

    }
}
