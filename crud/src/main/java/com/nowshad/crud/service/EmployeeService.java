package com.nowshad.crud.service;

import com.nowshad.crud.employee.dto.EmployeeDto;
import com.nowshad.crud.enity.Employee;
import com.nowshad.crud.repsitory.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        if (!ObjectUtils.isEmpty(employeeDto.getId())) {
            Optional<Employee> employee1 = employeeRepository.findById(employeeDto.getId());
            if (employee1.isPresent()) {
                employee = employee1.get();
                employeeDto.setId(employee.getId());
            }
        } else {
            employee = new Employee();
        }
        BeanUtils.copyProperties(employeeDto, employee);
        employee = employeeRepository.save(employee);
        BeanUtils.copyProperties(employee, employeeDto);

        return employeeDto;
    }

    public EmployeeDto findEmployeById(Long id) {

        Optional<Employee> employee = employeeRepository.findById(id);
        EmployeeDto employeeDto = new EmployeeDto();
        Employee e  = new Employee();
        if (employee.isPresent()) {
            BeanUtils.copyProperties(employee.get(), e);
        } else {
            e = new Employee();
        }
        BeanUtils.copyProperties(e, employeeDto);
        return employeeDto;
    }
}
