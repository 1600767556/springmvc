package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/user")
public class myController {
    @RequestMapping(value = "/some.do",method = RequestMethod.GET)
    public ModelAndView doSome(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","欢迎使用springmvc做web开发");
        modelAndView.addObject("fun","fun执行的是doSome开发");

        modelAndView.setViewName("show");
        return modelAndView;
    }

    @RequestMapping(value = "/other.do",method = RequestMethod.POST)
    public ModelAndView doOther(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","欢迎使用springmvc做web开发");
        modelAndView.addObject("fun","fun执行的是doOther方法");
        modelAndView.setViewName("other");
        return modelAndView;
    }
    @RequestMapping(value = "/first.do")
    public ModelAndView doFirst(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","欢迎使用springmvc做web开发"+request.getParameter("name"));
        modelAndView.addObject("fun","fun执行的是doOther方法");
        modelAndView.setViewName("other");
        return modelAndView;
    }
}
