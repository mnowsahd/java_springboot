package com.nowshad.crud.controller.Employee;


import com.google.gson.Gson;
import com.nowshad.crud.common.ResourceResponseWrapper;
import com.nowshad.crud.common.ResponseWrapper;
import com.nowshad.crud.employee.dto.EmployeeDto;
import com.nowshad.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/employee")
@RestController
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;

    Gson gson = new Gson();

    @PostMapping("/save")
    public String saveEmployee(@RequestBody EmployeeDto employeeDto) {
        ResponseWrapper<EmployeeDto> resourceResponseWrapper = null;
        EmployeeDto employe = employeeService.saveEmployee(employeeDto);
        resourceResponseWrapper = ResourceResponseWrapper.successResult("Success", employe);
        return gson.toJson(resourceResponseWrapper);
    }


    @PostMapping("/get/{id}")
    public String getEmployee(@PathVariable Long id) {
        ResponseWrapper<EmployeeDto> resourceResponseWrapper = null;
        EmployeeDto employe = null;
        try {
            employe = employeeService.findEmployeById(id);
            resourceResponseWrapper = ResourceResponseWrapper.successResult("Success", employe);
        } catch (Exception e) {
            resourceResponseWrapper = ResourceResponseWrapper.failResult("Failed", employe, "500");
            throw new RuntimeException(e);
        }
        return gson.toJson(resourceResponseWrapper);
    }

}
