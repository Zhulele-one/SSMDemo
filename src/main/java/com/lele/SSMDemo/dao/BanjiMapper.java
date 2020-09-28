package com.lele.SSMDemo.dao;

import com.lele.SSMDemo.domain.Banji;

import java.util.List;

public interface BanjiMapper {
    List<Banji> selectByBanjiName(String name);
}
