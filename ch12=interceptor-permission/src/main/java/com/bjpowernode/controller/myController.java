package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller

public class myController {

    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(String name,Integer age)  {
        System.out.println("执行Control中的doSome方法");
        ModelAndView modelAndView = new ModelAndView();


        modelAndView.addObject("myname",name);
        modelAndView.addObject("myage",age);

        modelAndView.setViewName("show");
        return modelAndView;

    }
}
