package com.example.tenant.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.tenant.entity.User;
import com.example.tenant.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Mr-CHEN
 * @version 1.0
 * @description: TODO
 * @date 2021-02-24 14:52
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/list")
    public Object getList(){
        List<User> list = userService.list();
        return list;
    }

    @GetMapping("/list/{page}")
    public Object getListByPage(@PathVariable Integer page){
        Page p = new Page(page,2);
        return userService.page(p);
    }
}
