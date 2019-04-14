package com.zjk.Service.ServiceImp;

import com.zjk.Dao.impl.StudentDaoImpl;
import com.zjk.entity.Student;

import java.util.List;

public class StudentServiceImp01 implements StudentService {
    @Override
    public List<Student> findAll() {
        return new StudentDaoImpl().findAll();
    }

    @Override
    public boolean insert(Student student) {
        return new StudentDaoImpl().insert(student);
    }

    @Override
    public boolean delete(int id) {
        return new StudentDaoImpl().delete(id);
    }

    @Override
    public Student findByID(int id) {
        return new StudentDaoImpl().findByID(id);
    }

    @Override
    public boolean update(Student student) {
        return new StudentDaoImpl().update(student);
    }
}
