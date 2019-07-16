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
        return employeesRepostory.createEmployee(employee);
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

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeesRepostory.updateEmployee(employee);
    }

    @GetMapping(value = "/employees", params = "ageMini")
    public List<Employee> findAgeAbove(@RequestParam int ageMini) {
        System.out.println(ageMini);
        return employeesRepostory.findSuitableEmployeesByAge(ageMini);
    }
}
