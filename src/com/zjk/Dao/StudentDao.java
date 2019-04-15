package com.zjk.Dao;

import com.zjk.entity.Student;

import java.util.List;

public interface StudentDao {

    List<Student> findAll();
    boolean insert(Student student);
    boolean delete(int id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Student findByID(int id);

    boolean update(Student student);

    List<Student> search(String num,String name);
}
