package com.ey.project.backend.controller;

import com.ey.project.backend.model.Employee;
import com.ey.project.backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository  EmployeeRepository;

    @PostMapping("/employee")
    Employee newEmployee(@RequestBody Employee employee) {
        return EmployeeRepository.save(employee);
    }

    @GetMapping("/employees")
    List<Employee> allEmployees() {
        return EmployeeRepository.findAll();
    }
}
