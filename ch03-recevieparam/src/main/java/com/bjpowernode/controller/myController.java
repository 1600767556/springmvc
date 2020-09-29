package com.bjpowernode.controller;

import com.bjpowernode.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
public class myController {
    @RequestMapping(value = "/receiveproperty.do")
    public ModelAndView doSome(String name,Integer age){

        ModelAndView modelAndView = new ModelAndView();
       modelAndView.addObject("myname",name);
       modelAndView.addObject("myage",age);

        modelAndView.setViewName("show");
        return modelAndView;
    }

    @RequestMapping(value = "/receiveobject.do")
    public ModelAndView receiveParam(Student student){
        System.out.println(student.getName()+"  "+student.getAge());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("myname",student.getName());
        modelAndView.addObject("myage",student.getAge());
        modelAndView.addObject("mystudent",student);
        modelAndView.setViewName("show");
        return modelAndView;
    }
}
