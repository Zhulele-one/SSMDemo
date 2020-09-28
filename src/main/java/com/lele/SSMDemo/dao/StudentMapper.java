package com.lele.SSMDemo.dao;

import com.lele.SSMDemo.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

    List<Student> findAll();

    Student findById(Integer id);

    void insertStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(Integer id);
    //按照学生姓名和分数查询学生信息
    List<Student> searchByNameAndScore(@Param("name") String name,@Param("score") Integer score);

    // 根据姓名查询学生成绩及所在班级
    List<Student> getByName(String name);
}
