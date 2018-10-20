package com.huixiaoer.rest.demo.dao;

import com.huixiaoer.rest.demo.model.Employee;
import org.springframework.stereotype.Component;

/**
 * @author create by jiazhaolin
 * @create 2018/10/13
 * @email zhaolin.jia@huixiaoer.com
 * @description
 */
@Component
public class EmployeeDao {

    public Employee selectEmployeeInfo(){
        // 查询 员工信息
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("范冰冰");
        employee.setMarry(false);

        return employee;

    }
}
