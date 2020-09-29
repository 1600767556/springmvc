package com.bjpowernode.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("111-拦截器的MyInterceptor的preHandle()");

        String loginName = "";
        //从session中获取name的值
        Object attr = request.getSession().getAttribute("name");
        if (attr != null){
            loginName = (String) attr;
        }

        if (!"zs".equals(loginName)){
            //给永辉一个提示页面
            request.getRequestDispatcher("/tips.jsp").forward(request, response);

            return  false;

        }
        return true;
    }


}
