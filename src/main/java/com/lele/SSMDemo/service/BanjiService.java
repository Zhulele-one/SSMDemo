package com.lele.SSMDemo.service;

import com.lele.SSMDemo.domain.Banji;

import java.util.List;
//一个班级有多个学生
public interface BanjiService {
    List<Banji> selectByBanjiName(String name);
}
