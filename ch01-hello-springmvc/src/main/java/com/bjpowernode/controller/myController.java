package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class myController {
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","欢迎使用springmvc做web开发");
        modelAndView.addObject("fun","fun web开发");
       // modelAndView.setViewName("/WEB-INF/view/show.jsp");
        modelAndView.setViewName("show");
        return modelAndView;
    }

}
