package com.github.vasiljeu95.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * employee
 *
 * @author Stepan Vasilyeu
 * @since 08.09.2022
 */
@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name")
    @Size(min = 2, message = "name must be min. 2 symbols")
    private String name;
    @Column(name = "surname")
    @Size(min = 2, message = "name must be min. 2 symbols")
    private String surName;
    @Column(name = "department")
    @Size(min = 2, message = "name must be min. 2 symbols")
    private String department;
    @Column(name = "salary")
    @Min(value = 500, message = "must be greater than 499")
    @Max(value = 1000, message = "must be less than 1001")
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, String surName, String department, int salary) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.department = department;
        this.salary = salary;
    }
}
