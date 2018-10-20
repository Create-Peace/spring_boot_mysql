package com.huixiaoer.rest.demo.controller;

import java.util.List;

import com.huixiaoer.rest.demo.dao.UserDao;
import com.huixiaoer.rest.demo.model.UserDO;
import com.huixiaoer.rest.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
private UserService userService;
 
    @ApiOperation(value = "添加嫔妃的操作")
    @PostMapping("")
    public UserDO insertUser(@RequestBody UserDO userDO) {
        return userService.insertUser(userDO);
    }
    @ApiOperation(value = "根据id查找信息")
    @GetMapping("/{id}")
    public UserDO selectUserById(@PathVariable Integer id) {
        return userService.selectUserById(id);
    }

    @ApiOperation("查询所有的信息")
    @GetMapping("")
    public List<UserDO> listUsers () {
        return userService.listUsers();
    }
    @ApiOperation("修改useDO的部分属性")
    @PatchMapping("")
    public UserDO updateUserById (UserDO userDO) {
        return userService.updateUserById(userDO);
    }

    @ApiOperation("册封为皇后")
    @PatchMapping("/transfer")
    public List<UserDO> updateUsers(UserDO user1, UserDO user2) {
        return userService.updateUsers(user1, user2);
    }
}