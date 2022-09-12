package com.github.vasiljeu95.service;

import com.github.vasiljeu95.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(Employee employee);
}
