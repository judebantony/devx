package com.jba.devx.devx.api;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jba.devx.devx.model.Employee;
@Service
public class EmployeeServiceImp implements EmployeeService {

    /* (non-Javadoc)
     * @see com.jba.devx.devx.api.EmployeeService#getEmployee(int)
     * Get employee by id
     */
    @Override
    public Employee getEmployee(int empId) {
        return Optional.ofNullable(empId)
                .map(idNotNull -> {
                    if (idNotNull.equals(1)) {
                        return Employee.builder()
                        .empEmail("judebantony@gmail.com")
                        .empId(1)
                        .empName("Jude Antony").build();
                    } else {
                        return null;
                    }
                })
                .orElseThrow(() -> new IllegalArgumentException("Id should be set to return employee"));
    }
}
    

