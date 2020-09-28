package com.lele.SSMDemo.Controller;

import com.lele.SSMDemo.domain.Student;
import com.lele.SSMDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ShowController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/show")
    public String show(ModelMap modelMap){
        //调用service ,查看所有学生信息
        List<Student> stus =studentService.findAll();
        modelMap.put("stus",stus);
        System.out.println("stus="+stus);
        return "show";
    }

    @GetMapping("/findById")
    public String add(Integer id ,ModelMap modelMap){
        //调用Service,根据id查看
        Student stu =studentService.findById(id);
        modelMap.put("stu", stu);
        return "edit";
    }

    @PostMapping("/insertStudent")
    public String insertStudent(Student student){
        studentService.insertStudent(student);
        return "redirect:show";
    }

    @PostMapping("/edit")
    public String editStudent(Student student){
        studentService.updateStudent(student);
        return "redirect:show";
    }
    @GetMapping("/deleteStudent")
    public String deleteStudent(Integer id){
        studentService.deleteStudent(id);
        return "redirect:show";
    }
    @GetMapping("/searchByNameAndScore")
    public String searchByNameAndScore(String name,Integer score,ModelMap modelMap){
        List<Student> stus=studentService.searchByNameAndScore(name,score);
        System.out.println(stus);
        modelMap.put("stus", stus);
        return "show";
    }

    @GetMapping("/getByName")
    public String getByName(String name,ModelMap modelMap){
        List<Student> stus =  studentService.getByName(name);
        System.out.println(stus);
        modelMap.put("stus", stus);
        return "show";
    }
}
