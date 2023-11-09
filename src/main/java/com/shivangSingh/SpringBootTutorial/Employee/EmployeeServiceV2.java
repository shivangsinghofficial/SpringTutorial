package com.shivangSingh.SpringBootTutorial.Employee;

import com.shivangSingh.SpringBootTutorial.Sort.SortAlorithm;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceV2 {

    SortAlorithm sortAlorithm;

    public EmployeeServiceV2(SortAlorithm sortAlorithm) {
        this.sortAlorithm = sortAlorithm;
    }

    public void sortEmployee(Object employees) {
        // Sort the employee using sortAlgorithm class
    }
}
