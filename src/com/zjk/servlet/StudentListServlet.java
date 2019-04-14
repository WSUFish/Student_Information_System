package com.zjk.servlet;

import com.zjk.Dao.StudentDao;
import com.zjk.Dao.impl.StudentDaoImpl;
import com.zjk.Service.ServiceImp.StudentService;
import com.zjk.Service.ServiceImp.StudentServiceImp01;
import com.zjk.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentListServlet")
public class StudentListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        StudentService studentService=new StudentServiceImp01();
        List<Student> list=studentService.findAll();
        request.getSession().setAttribute("list",list);

        response.sendRedirect("studentList.jsp");
    }
}
