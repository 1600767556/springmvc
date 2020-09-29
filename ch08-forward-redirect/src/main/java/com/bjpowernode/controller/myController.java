package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller

public class myController {

    @RequestMapping(value = "doForward.do")
    public ModelAndView doSome(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","欢迎使用springmvc做web开发");
        modelAndView.addObject("fun","fun执行的是doSome开发");

        //modelAndView.setViewName("forward:/WEB-INF/view/show.jsp");
        modelAndView.setViewName("forward:/hello.jsp");
        return modelAndView;

    }

    /**
     * 重定向
     * @return
     */
    @RequestMapping(value = "doRedirect.do")
    public ModelAndView doWithRedirect(String name,Integer age){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("myname",name);
        modelAndView.addObject("myage",age);
        modelAndView.setViewName("redirect:/hello.jsp");
        return modelAndView;

    }
}
