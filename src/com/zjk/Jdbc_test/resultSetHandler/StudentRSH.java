package com.zjk.Jdbc_test.resultSetHandler;

import com.zjk.entity.Student;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentRSH implements ResultSetHandler<List<Student>> {
    @Override
    public List<Student> handle(ResultSet rs) {
        List<Student> list=new ArrayList<>();
        try {
            while (rs.next()){
                Student stu=new Student();
                stu.setId(rs.getInt("Sid"));
                stu.setName(rs.getString("Sname"));
                stu.setSex(rs.getString("Ssex"));
                stu.setNum(rs.getString("Snum"));
                stu.setEmail(rs.getString("Semail"));
                stu.setPhone(rs.getString("Sphone"));
                stu.setAddress(rs.getString("Saddress"));
                list.add(stu);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
