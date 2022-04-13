package com.bridgelabz.employee.entity;

import com.bridgelabz.employee.dto.EmployeeDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
public class Employee {


    public long id;
    public String name;
    public long salary;

    public Employee(){

    }

    public Employee(long id, EmployeeDTO employeeDTO) {
        this.id = id;
        this.name = employeeDTO.name;
        this.salary = employeeDTO.salary;
    }
}
