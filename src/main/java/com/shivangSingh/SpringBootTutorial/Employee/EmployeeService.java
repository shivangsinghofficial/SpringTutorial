package com.shivangSingh.SpringBootTutorial.Employee;

import com.shivangSingh.SpringBootTutorial.Sort.BubbleSort;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    BubbleSort bubbleSort;

    public EmployeeService() {
        bubbleSort = new BubbleSort();
    }

    public void sortEmployee(Object employees) {
        // Sort the employee using bubble sort class
    }
}
