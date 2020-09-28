package com.lele.SSMDemo.domain;

import java.io.Serializable;
import java.util.List;

public class Banji implements Serializable {
    private Integer Id;
    private String name;
    private List<Student> students;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Banji() {
    }

    public Banji(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Banji{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
