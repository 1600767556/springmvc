package com.bjpowernode.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class MyInterceptor implements HandlerInterceptor {
    private long btime = 0;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器的MyInterceptor的preHandle()");

      //  request.getRequestDispatcher("/tips.jsp").forward(request,response);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        btime = System.currentTimeMillis();
        System.out.println("拦截器的MyInterceptor的postHandle()");

        if (modelAndView != null){
            modelAndView.addObject("mydate",new Date());
            modelAndView.setViewName("other");
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("拦截器的MyInterceptor的afterCompletion()");
        long etime = System.currentTimeMillis();
        System.out.println("计算从preHandle到请求处理完成的时间:"+(etime - btime));
    }
}
