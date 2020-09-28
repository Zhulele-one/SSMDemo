package com.lele.SSMDemo.service.impl;

import com.lele.SSMDemo.dao.StudentMapper;
import com.lele.SSMDemo.domain.Student;
import com.lele.SSMDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper StudentMapper;
    @Override
    public List<Student> findAll() {

        return StudentMapper.findAll();
    }

    @Override
    public Student findById(Integer id) {
        return StudentMapper.findById(id);
    }

    @Override
    public void insertStudent(Student student) {
        StudentMapper.insertStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        StudentMapper.updateStudent(student);
    }

    @Override
    public void deleteStudent(Integer id) {
        StudentMapper.deleteStudent(id);
    }

    @Override
    public List<Student> searchByNameAndScore(String name, Integer score) {
        return StudentMapper.searchByNameAndScore(name,score);
    }

    @Override
    public List<Student> getByName(String name) {
        return StudentMapper.getByName(name);
    }

}
