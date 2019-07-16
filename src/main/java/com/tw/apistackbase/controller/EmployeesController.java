package com.tw.apistackbase.controller;

import com.tw.apistackbase.modle.Employee;
import com.tw.apistackbase.repository.EmployeesRepostory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesController {
    public EmployeesRepostory employeesRepostory = new EmployeesRepostory();

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeesRepostory.createEmployee(employee.getName(),employee.getAge(),employee.getGender());
    }
}
