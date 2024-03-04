package com.nowshad.crud.employee.dto;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class EmployeeDto {


    private Long id;
    private String employeeName;
    private String employeeSalary;

}
