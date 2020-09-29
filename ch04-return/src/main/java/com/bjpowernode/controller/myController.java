package com.bjpowernode.controller;

import com.bjpowernode.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
public class myController {
    @RequestMapping(value = "/returnString-view.do")
    public String doReturnView(HttpServletRequest request ,String name,Integer age){
        System.out.println(name+"   -  "+age);
        request.setAttribute("myname",name);

        request.setAttribute("myage",age);
        return "show";
    }

    @RequestMapping(value = "/returnString-view2.do")
    public String doReturnView2(HttpServletRequest request ,String name,Integer age){
        System.out.println(name+"   --  "+age);
        request.setAttribute("myname",name);

        request.setAttribute("myage",age);
        return "show";
    }
    @RequestMapping(value = "/returnStudentJson.do")
    @ResponseBody
    public Student doStudentJsonObject(String name, Integer age){
       Student student = new Student();
       student.setAge(202);
       student.setName("李四同学");
       return student;
    }

    @RequestMapping(value = "/returnStudentJsonArray.do")
    @ResponseBody
    public List<Student> doStudentJsonObjectArray(String name, Integer age){
        List<Student> list = new ArrayList<>();

        Student student = new Student();
        student.setAge(20);
        student.setName("李四同学");
        list.add(student);

         student = new Student();
        student.setAge(21);
        student.setName("张三同学");
        list.add(student);

        return list;
    }
    @RequestMapping(value = "returnStringData.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String doStringData(String name,Integer age){
        return "Hello SpringMVC 返回对象,表示数据";
    }


}
