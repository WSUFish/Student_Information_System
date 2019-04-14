package com.zjk.servlet;

import com.zjk.Service.ServiceImp.StudentService;
import com.zjk.Service.ServiceImp.StudentServiceImp01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteServlet")
public class DeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        int id=Integer.parseInt(request.getParameter("id"));
        StudentService service=new StudentServiceImp01();
        service.delete(id);
        request.getRequestDispatcher("list_servlet").forward(request,response);
    }
}
