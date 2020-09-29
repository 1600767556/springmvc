package com.bjpowernode.handler;


import com.bjpowernode.exception.AgeException;
import com.bjpowernode.exception.NameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 控制器增强(增加异常处理)
 */
@ControllerAdvice
public class GolbalExceptionHandler {
    @ExceptionHandler(value = NameException.class)
    public ModelAndView doNameExceptio(Exception exception){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","姓名必须是zs");
        modelAndView.addObject("ex",exception);
        modelAndView.setViewName("nameError");
        return modelAndView;
    }

    @ExceptionHandler(value = AgeException.class)
    public ModelAndView doAgeExceptio(Exception exception){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","您的年龄不能大于80");
        modelAndView.addObject("ex",exception);
        modelAndView.setViewName("ageError");
        return modelAndView;
    }
    //处理其他异常
    @ExceptionHandler
    public ModelAndView doOtherExceptio(Exception exception){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","姓名必须是zs");
        modelAndView.addObject("ex",exception);
        modelAndView.setViewName("defaultError");
        return modelAndView;
    }


}
