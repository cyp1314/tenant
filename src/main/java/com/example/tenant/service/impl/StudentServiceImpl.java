package com.example.tenant.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.tenant.entity.Student;
import com.example.tenant.mapper.StudentMapper;
import com.example.tenant.service.IStudentService;
import org.springframework.stereotype.Service;

/**
 * @author Mr-CHEN
 * @version 1.0
 * @description: TODO
 * @date 2021-02-24 14:47
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {
}
