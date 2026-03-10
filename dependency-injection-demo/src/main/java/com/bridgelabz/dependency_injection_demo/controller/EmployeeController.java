package com.bridgelabz.dependency_injection_demo.controller;

import com.bridgelabz.dependency_injection_demo.component.EmployeeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeBean employeeBean;

    @GetMapping("/employee")
    public String getEmployee() {
        return employeeBean.getEmployeeDetails();
    }

}