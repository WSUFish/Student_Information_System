package com.zjk.Dao.impl;

import com.zjk.Dao.StudentDao;
import com.zjk.Jdbc_test.JDBCUtil;
import com.zjk.Jdbc_test.resultSetHandler.SingleStudentRSH;
import com.zjk.Jdbc_test.resultSetHandler.StudentRSH;
import com.zjk.entity.Student;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> findAll() {
        List<Student> list=JDBCUtil.query("select * from student",new StudentRSH());
        return list;
    }

    @Override
    public boolean insert(Student student) {
        JDBCUtil.update("insert into student values(null,?,?,?,?,?,?)",
                student.getNum(),
                student.getName(),
                student.getSex(),
                student.getAddress(),
                student.getEmail(),
                student.getPhone()
        );
        return true;
    }

    @Override
    public boolean delete(int Sid) {
        JDBCUtil.update("delete from student where Sid=?",Sid);
        return false;
    }

    @Override
    public Student findByID(int id) {
        return JDBCUtil.query("select * from student where Sid=?",new SingleStudentRSH(),id);
    }

    @Override
    public boolean update(Student student) {
        JDBCUtil.update("update student set Snum=?, Sname=?, Ssex=?, Saddress=?, Semail=?, Sphone=? where Sid=?",
                student.getNum(),
                student.getName(),
                student.getSex(),
                student.getAddress(),
                student.getEmail(),
                student.getPhone(),
                student.getId()
        );
        return false;
    }
}
