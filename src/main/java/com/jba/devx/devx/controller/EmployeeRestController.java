package com.jba.devx.devx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jba.devx.devx.api.EmployeeService;
import com.jba.devx.devx.model.Employee;

@RestController
public class EmployeeRestController {
    private EmployeeService employeeService;

    
    public EmployeeRestController(@Autowired EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    
    @GetMapping("/api/v1/employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int id) {
        return ResponseEntity.ok().body(employeeService.getEmployee(id));
    }

}
