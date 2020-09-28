package com.lele.SSMDemo.service.impl;

import com.lele.SSMDemo.dao.BanjiMapper;
import com.lele.SSMDemo.domain.Banji;
import com.lele.SSMDemo.service.BanjiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BanjiServiceImpl implements BanjiService {

    @Autowired
    private BanjiMapper  banjiMapper;

    @Override
    public List<Banji> selectByBanjiName(String name) {
        return banjiMapper.selectByBanjiName(name);
    }
}
