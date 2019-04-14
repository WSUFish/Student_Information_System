package com.zjk.servlet;

import com.zjk.Dao.StudentDao;
import com.zjk.Dao.UserDao;
import com.zjk.Dao.impl.StudentDaoImpl;
import com.zjk.Dao.impl.UserDaoImpl;
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

/**
 * 用于处理登录
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String username=request.getParameter("username");
        String password=request.getParameter("password");
        System.out.println("username="+username+" password="+password);

        UserDao Dao=new UserDaoImpl();
        if(Dao.login(username,password)){
            request.getRequestDispatcher("list_servlet").forward(request,response);
        }else {
            response.getWriter().write("用户名或密码错误!");
        }
    }
}
