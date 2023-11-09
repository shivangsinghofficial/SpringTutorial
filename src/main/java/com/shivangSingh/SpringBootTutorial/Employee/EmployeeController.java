package com.shivangSingh.SpringBootTutorial.Employee;

import com.shivangSingh.SpringBootTutorial.Domain.Employee;
import com.shivangSingh.SpringBootTutorial.Domain.EmployeeCoreJava;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String welcome() {
        // Core java object creation
        EmployeeCoreJava employeeCoreJava = new EmployeeCoreJava("123", "DEV101", "Patrick", null);
        String empNameForCoreJavaObject = employeeCoreJava.getName();
        employeeCoreJava.setId("345");


        // Object creation using spring
        Employee emp = Employee.builder().id("123").name("Patrick").teamId("DEV101").build();
        String empName = emp.getName();
        emp.setName("Patrick Damon");
        return "Welcome to Employee Leave Tracking Portal";
    }
}
