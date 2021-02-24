package com.example.tenant.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.tenant.entity.User;
import com.example.tenant.mapper.UserMapper;
import com.example.tenant.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author Mr-CHEN
 * @version 1.0
 * @description: TODO
 * @date 2021-02-24 14:47
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
