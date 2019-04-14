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

@WebServlet(name = "EditServlet")
public class EditServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int Sid=Integer.parseInt(request.getParameter("id"));
        StudentService service=new StudentServiceImp01();
        Student student=service.findByID(Sid);
        request.setAttribute("stu",student);
        request.getRequestDispatcher("edit.jsp").forward(request,response);
    }
}
