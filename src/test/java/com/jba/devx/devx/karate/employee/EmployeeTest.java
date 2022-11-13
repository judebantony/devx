package com.jba.devx.devx.karate.employee;

import org.springframework.boot.test.context.SpringBootTest;

import com.intuit.karate.junit5.Karate;
import com.jba.devx.devx.DevxApplication;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT, classes = {DevxApplication.class})
public class EmployeeTest {

    @Karate.Test
    Karate testGetEmployee() {
        return Karate.run("getEmployee").relativeTo(getClass());
    }
    
}
