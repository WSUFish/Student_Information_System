package com.zjk.Dao.impl;

import com.zjk.Dao.UserDao;
import com.zjk.Jdbc_test.JDBCUtil;
import com.zjk.Jdbc_test.resultSetHandler.UserRSH;
import com.zjk.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean login(String name,String password) {
        User user = null;
        String sql = "select * from user where Uname=? and Upassword=?";
        user = JDBCUtil.query(sql, new UserRSH(), name, password);
        return (user != null);
    }
}
