package com.bridgelabz.dependency_injection_demo.component;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {

    public String getDepartment() {
        return "Engineering Department";
    }

}