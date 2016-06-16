package com.mybatis.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mybatis.model.Student;
import com.mybatis.service.StudentService;

@Controller  
@RequestMapping(value="/stu")  
public class StudentController {
    
	@Resource
    private StudentService studentService;  
      
    @RequestMapping(value="/showUser", method=RequestMethod.GET)  
    public String toIndex(HttpServletRequest request, Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        Student student = this.studentService.getStudentById(userId);  
        model.addAttribute("student", student);  
        return "showUser";  
    }  
}
