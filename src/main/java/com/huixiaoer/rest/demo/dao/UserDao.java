package com.huixiaoer.rest.demo.dao;

import java.util.List;

import com.huixiaoer.rest.demo.model.UserDO;

public interface UserDao {
    public Integer insertUser(UserDO userDO);
    public UserDO selectUserById (Integer id);
    public List<UserDO> listUsers();
    public Integer updateUserById(UserDO userdo);
}