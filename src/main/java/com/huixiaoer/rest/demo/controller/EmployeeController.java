package com.huixiaoer.rest.demo.controller;

import com.huixiaoer.rest.demo.model.Employee;
import com.huixiaoer.rest.demo.service.EmployeeService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author create by jiazhaolin
 * @create 2018/10/13
 * @email zhaolin.jia@huixiaoer.com
 * @description
 */
@RestController
@RequestMapping("/employees")
// localhost:8080/employees
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("")
    public Employee selectEmployeeInfo(){
        return employeeService.selectEmployeeInfo();

    }

    @ApiOperation(value = "创建员工信息")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "员工id",name = "id",paramType = "query"),
            @ApiImplicitParam(value = "员工姓名",name = "name",paramType = "query"),
            @ApiImplicitParam(value = "员工婚姻状况，true =已婚 fasle=未婚",name = "marry",paramType = "query")
    })
    @PostMapping("")
    public Employee createEmployee(Integer id,String name,Boolean marry){
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setMarry(marry);

        return employee;
    }
}
