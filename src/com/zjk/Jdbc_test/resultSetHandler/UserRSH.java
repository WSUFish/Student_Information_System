package com.zjk.Jdbc_test.resultSetHandler;

import com.zjk.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRSH implements ResultSetHandler<User> {
    @Override
    public User handle(ResultSet rs) {
        User user=new User();
        try {
            if(rs.next()){
                user.setName(rs.getString("Uname"));
                user.setPassword(rs.getString("Upassword"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
