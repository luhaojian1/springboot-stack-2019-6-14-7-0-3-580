package com.tw.apistackbase.repository;

import com.tw.apistackbase.modle.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeesRepostory {
    public static Map<String, Employee> employees = new HashMap<>();

    public Employee createEmployee(String name, int age, String gender) {
        String employeeId = UUID.randomUUID().toString();
        Employee employee = new Employee();
        employee.setId(employeeId);
        employee.setName(name);
        employee.setAge(age);
        employee.setGender(gender);
        employees.put(employeeId, employee);
        return employee;
    }

    public Employee findById(String employeeId){
        return employees.get(employeeId);
    }

    public List<Employee> findAll(){
        return new ArrayList<>(employees.values());
    }

    public Employee updateEmployee(Employee employee){
        employees.put(employee.getId(),employee);
        return employee;
    }

    public Employee deleteEmployee(String employeeId){
        return employees.remove(employeeId);
    }


}
