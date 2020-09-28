package com.lele.SSMDemo.Controller;

import com.lele.SSMDemo.domain.Banji;
import com.lele.SSMDemo.service.BanjiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BanjiController {

    @Autowired
    private BanjiService banjiService;

    @RequestMapping("/searchBanji")
    public String searchBanji(String name, ModelMap modelMap){
        List<Banji> students =banjiService.selectByBanjiName(name);
        System.out.println(students);
        modelMap.put("stus",students);
        return "showBanji";
    }
}
