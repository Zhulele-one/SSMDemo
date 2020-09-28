package com.lele.SSMDemo.service;

import com.lele.SSMDemo.domain.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    Student findById(Integer id);

    void insertStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(Integer id);

    List<Student> searchByNameAndScore(String name,Integer score);

    // 根据姓名查询学生成绩及所在班级
    List<Student> getByName(String name);
}
