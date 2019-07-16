package com.tw.apistackbase.controller;

import com.tw.apistackbase.modle.Employee;
import com.tw.apistackbase.repository.EmployeesRepostory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeesController {
    public EmployeesRepostory employeesRepostory = new EmployeesRepostory();

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeesRepostory.createEmployee(employee.getName(), employee.getAge(), employee.getGender());
    }

    @GetMapping("/employees/{employeeId}")
    public Employee findById(@PathVariable String employeeId) {
        System.out.println(employeeId);
        return employeesRepostory.findById(employeeId);
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeesRepostory.findAll();
    }

    @DeleteMapping("/employees/{employeeId}")
    public Employee deleteById(@PathVariable String employeeId) {
        return employeesRepostory.deleteEmployee(employeeId);
    }
}
