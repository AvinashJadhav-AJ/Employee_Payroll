package com.bridgelabz.employee.service;

import com.bridgelabz.employee.EmployeeApplication;
import com.bridgelabz.employee.dto.EmployeeDTO;
import com.bridgelabz.employee.entity.Employee;

import java.util.List;

public interface EmployeePayrollService {

    List<Employee> getEmployeePayrollData();

    Employee getEmployeeById(long id);

    Employee createEmployee(EmployeeDTO employeeDTO);

    Employee updateEmployee(EmployeeDTO employeeDTO);

    void deleteEmployee(long Id);
}
