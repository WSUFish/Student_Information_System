package com.zjk.servlet;

import com.zjk.Service.ServiceImp.StudentService;
import com.zjk.Service.ServiceImp.StudentServiceImp01;
import com.zjk.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateServlet")
public class UpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        int id=Integer.parseInt(request.getParameter("id"));
        String num=request.getParameter("num");
        String name=request.getParameter("name");
        String sex=request.getParameter("sex");
        String phone=request.getParameter("phone");
        String email=request.getParameter("email");
        String address=request.getParameter("address");

        Student student=new Student(num,sex,email,name,address,id,phone);

        StudentService service=new StudentServiceImp01();
        service.update(student);
        request.getRequestDispatcher("list_servlet").forward(request,response);
    }
}
