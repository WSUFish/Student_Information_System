package com.zjk.Dao.impl;

import com.zjk.Dao.StudentDao;
import com.zjk.Jdbc_test.JDBCUtil;
import com.zjk.entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> findAll() {
        Connection c=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String sql="select * from student";
        List<Student> list=new ArrayList<>();
        try {
            c= JDBCUtil.getConn();
            ps=c.prepareStatement(sql);
            rs=ps.executeQuery();


            while (rs.next()){
                Student stu=new Student();

                stu.setAge(rs.getInt("Sage"));
                stu.setName(rs.getString("Sname"));
                stu.setSex(rs.getString("Ssex"));
                stu.setNum(rs.getString("Snum"));
                stu.setEmail(rs.getString("Semail"));
                stu.setPhone(rs.getString("Sphone"));
                stu.setAddress(rs.getString("Saddress"));
                System.out.println("phone is "+stu.getPhone()+" email is "+stu.getEmail());
                list.add(stu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(c,ps,rs);
        }
        return list;
    }
}
