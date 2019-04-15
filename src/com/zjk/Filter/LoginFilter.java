package com.zjk.Filter;

import com.zjk.Dao.UserDao;
import com.zjk.entity.LoginInfo;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletResponse response=(HttpServletResponse)resp;
        HttpSession session=((HttpServletRequest) req).getSession();
        LoginInfo loginInfo=(LoginInfo)session.getAttribute("login");
        String uri=((HttpServletRequest) req).getRequestURI();
        if(!((loginInfo!=null&&loginInfo.isSucceed())||uri.endsWith("login.jsp")||uri.endsWith("login_servlet"))){
            response.sendRedirect(((HttpServletRequest) req).getContextPath()+"/login.jsp");
            return;
        }
        chain.doFilter(req, resp);

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
