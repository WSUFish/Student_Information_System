package com.zjk.Jdbc_test.resultSetHandler;

import com.zjk.entity.Student;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SingleStudentRSH implements ResultSetHandler<Student> {
    @Override
    public Student handle(ResultSet rs) {
        Student student = new Student();
        try {
            if(rs.next()){
                student.setId(rs.getInt("Sid"));
                student.setName(rs.getString("Sname"));
                student.setSex(rs.getString("Ssex"));
                student.setAddress(rs.getString("Saddress"));
                student.setNum(rs.getString("Snum"));
                student.setEmail(rs.getString("Semail"));
                student.setPhone(rs.getString("Sphone"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }
}
