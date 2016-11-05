package com.vstaryw.web.service.user.impl;

import org.springframework.stereotype.Service;

import com.vstaryw.web.mapper.user.UserMapper;
import com.vstaryw.web.model.user.User;
import com.vstaryw.web.service.user.IUserService;
import com.baomidou.framework.service.impl.SuperServiceImpl;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * User 表数据服务层接口实现类
 *
 */
@Service
public class UserServiceImpl extends SuperServiceImpl<UserMapper, User> implements IUserService {

    @Override
    @Transactional
    public void test() {
        User user = new User();
        user.setName("a01");
        user.setAge(22);
        this.insert(user);
        Long id = 793789242842689536L;
        this.deleteById(id);
        int a = 1/0;
    }
}