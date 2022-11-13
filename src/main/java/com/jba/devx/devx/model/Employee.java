package com.jba.devx.devx.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    int empId;
    String empName;
    String empAddress;
    String empPhone;
    String empEmail;
    String title;
    String dept;
    int managerId;
    int salary;
}
