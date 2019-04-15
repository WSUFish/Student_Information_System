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
import java.util.List;

@WebServlet(name = "SearchServlet")
public class SearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String num=request.getParameter("num");
        String name=request.getParameter("name");

        StudentService service=new StudentServiceImp01();
        List<Student> list=service.search(num,name);

        request.getSession().setAttribute("list",list);
        request.getRequestDispatcher("studentList.jsp").forward(request,response);
    }
}
