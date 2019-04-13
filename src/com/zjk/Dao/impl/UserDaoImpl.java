package com.zjk.Dao.impl;

import com.zjk.Dao.UserDao;
import com.zjk.Jdbc_test.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean login(String name,String password) {
        Connection connection= null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            connection=JDBCUtil.getConn();
            String sql="select * from user where Uname=? and Upassword=?";

            ps=connection.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,password);

            rs=ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
