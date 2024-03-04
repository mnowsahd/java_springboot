package com.nowshad.crud.service;

import com.nowshad.crud.employee.dto.EmployeeDto;
import com.nowshad.crud.enity.Employee;
import com.nowshad.crud.repsitory.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
    Optional<Employee> employee = employeeRepository.findById(employeeDto.getId());
    if (employee.isPresent()) {
        BeanUtils.copyProperties(employeeDto, employee, "id");
    } else {
        employee = Optional.of(new Employee());
    }
    BeanUtils.copyProperties(employee, employeeDto);
    return employeeDto;
    }
}
