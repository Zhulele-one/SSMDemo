package com.lele.SSMDemo.Controller;

import com.lele.SSMDemo.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/test")
public class TestController {
    /**
     * 模拟异步请求响应
     * @return
     */
    @RequestMapping("/testAjax")
    public @ResponseBody Student  testAjax(@RequestBody Student student){
        System.out.println("testAjax方法执行了");
        //客户端发送ajax的请求，传的是json字符串，后端把json字符串封装到student对象中
        System.out.println(student);
        //做相应，模拟查询数据库
            student.setName("haha");
            student.setScore(89);
        return student;
    }
}
