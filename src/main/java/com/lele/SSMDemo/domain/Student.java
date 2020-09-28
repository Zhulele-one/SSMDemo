package com.lele.SSMDemo.domain;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String nickname;
    private String name;
    private String sex;
    private Integer score;
    private Banji banji;
    private MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Banji getBanji() {
        return banji;
    }

    public void setBanji(Banji banji) {
        this.banji = banji;
    }

    public Student() {
    }

    public Student(String nickname, String name, String sex, Integer score, Banji banji) {
        this.nickname = nickname;
        this.name = name;
        this.sex = sex;
        this.score = score;
        this.banji = banji;
    }

    public Student(int id, String nickname, String name, String sex, Integer score, Banji banji) {
        this.id = id;
        this.nickname = nickname;
        this.name = name;
        this.sex = sex;
        this.score = score;
        this.banji = banji;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", score=" + score +
                ", banji=" + banji +
                '}';
    }
}
