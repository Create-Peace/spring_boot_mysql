package com.huixiaoer.rest.demo.service;

import com.huixiaoer.rest.demo.dao.EmployeeDao;
import com.huixiaoer.rest.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author create by jiazhaolin
 * @create 2018/10/13
 * @email zhaolin.jia@huixiaoer.com
 * @description
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public Employee selectEmployeeInfo(){
        // 查询 员工信息
        return employeeDao.selectEmployeeInfo();
    }
}
