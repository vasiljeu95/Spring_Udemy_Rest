package com.github.vasiljeu95.controller;

import com.github.vasiljeu95.entity.Employee;
import com.github.vasiljeu95.exeptionHandling.EmployeeIncorrectData;
import com.github.vasiljeu95.exeptionHandling.NoSuchEmployeeException;
import com.github.vasiljeu95.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * MyRESTController
 *
 * @author Stepan Vasilyeu
 * @since 12.09.2022
 */
@RestController
@RequestMapping("/api")
public class MyRESTController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees () {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }

    @GetMapping("/employees/{id}")
    private Employee showEmployeeById (@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);

        if (employee == null) {
            String message = "There is no employee with ID = " + id + " in Database";
            throw new NoSuchEmployeeException(message);
        }

        return employee;
    }
}
