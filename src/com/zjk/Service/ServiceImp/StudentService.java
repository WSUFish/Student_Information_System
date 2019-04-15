package com.zjk.Service.ServiceImp;

import com.zjk.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    boolean insert(Student student);
    boolean delete(int id);
    Student findByID(int id);
    boolean update(Student student);
    List<Student> search(String num,String name);
}
