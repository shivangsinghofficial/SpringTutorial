package com.shivangSingh.SpringBootTutorial.Employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to Employee Leave Tracking Portal";
    }
}
