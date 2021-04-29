package com.quanty.cloud.service.zk.service.impl;

import com.quanty.cloud.service.zk.entity.User;
import com.quanty.cloud.service.zk.mapper.mapper2.UserMapper;
import com.quanty.cloud.service.zk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2020/12/21 16:47
 * @Created by willi
 */
@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findallUser() {
        return  userMapper.selectAll();
    }
}
