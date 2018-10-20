package com.huixiaoer.rest.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.huixiaoer.rest.demo.dao.UserDao;
import com.huixiaoer.rest.demo.model.UserDO;
import com.huixiaoer.rest.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public UserDO insertUser(UserDO userDO) {
        userDao.insertUser(userDO);
        return selectUserById(userDO.getId());
        // return null;
	}

    @Override
    public UserDO selectUserById(Integer id) {
        return userDao.selectUserById(id);
    }

    @Override
    public List<UserDO> listUsers() {
		return userDao.listUsers();
	}

    @Override
    public UserDO updateUserById(UserDO userDO) {
        userDao.updateUserById(userDO);
        return selectUserById(userDO.getId());
    }

    @Override
    @Transactional
    public List<UserDO> updateUsers(UserDO user1, UserDO user2) {
        //  更新乌拉娜拉氏的信息
        updateUserById(user1);
        int i = 5 / 0;
        // 更新5阿哥
        updateUserById(user2);

        UserDO userDO = selectUserById(user1.getId());
        UserDO userDO1 = selectUserById(user2.getId());

        List<UserDO> list = new ArrayList<>();
        list.add(userDO);
        list.add(userDO1);
        return null;
    }

}