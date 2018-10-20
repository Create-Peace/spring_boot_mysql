package com.huixiaoer.rest.demo.service;

import java.util.List;

import com.huixiaoer.rest.demo.model.UserDO;

public interface UserService {
    public UserDO insertUser(UserDO userDO);
    public UserDO selectUserById(Integer id);
    public List<UserDO> listUsers();
    public UserDO updateUserById(UserDO userdo);
	public List<UserDO> updateUsers(UserDO user1, UserDO user2);
}