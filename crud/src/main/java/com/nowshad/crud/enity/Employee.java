package com.nowshad.crud.enity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;

    @Column(name = "EmployeeId")
    private Long employeeId;

    @Column(name = "EmployeeName")
    private String employeeName;

    @Column(name = "EmployeeSalary")
    private String employeeSalary;
}
