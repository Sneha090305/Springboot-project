package com.bridgelabz.dependency_injection_demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

    @Autowired
    private DepartmentBean departmentBean;

    public String getEmployeeDetails() {
        return "Employee belongs to " + departmentBean.getDepartment();
    }

}