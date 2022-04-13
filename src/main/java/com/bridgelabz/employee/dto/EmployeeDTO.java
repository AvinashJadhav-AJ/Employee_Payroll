package com.bridgelabz.employee.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class EmployeeDTO {
    @NotEmpty(message = "Please Enter YOur Name")
    @Pattern(regexp = "[A-Z]{1}[a-zA-z\\s]{2,}$", message = "Employee Name IS Invalid")
    public String name;
    @Min(value = 5000, message = "Salary should be more than 5000")
    public long salary;

    public EmployeeDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
