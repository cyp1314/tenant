package com.example.tenant.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.tenant.entity.Student;
import com.example.tenant.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Mr-CHEN
 * @version 1.0
 * @description: TODO
 * @date 2021-02-24 14:52
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/list")
    public Object getList(){
        List<Student> list = studentService.list();
        return list;
    }

    @GetMapping("/list/{page}")
    public Object getListByPage(@PathVariable Integer page){
        Page p = new Page(page,2);
        return studentService.page(p);
    }

    @PostMapping("/save")
    public boolean save(@RequestBody Student student){
        boolean save = studentService.save(student);
        return save;
    }
}
