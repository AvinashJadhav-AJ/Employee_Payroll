package com.bridgelabz.employee.service;

import com.bridgelabz.employee.dto.EmployeeDTO;
import com.bridgelabz.employee.entity.Employee;
import com.bridgelabz.employee.exception.EmployeePayrollException;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollServiceImpl implements EmployeePayrollService {


    @Override
    public List<Employee> getEmployeePayrollData() {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, new EmployeeDTO("Avinash", 20000)));
        employeeList.add(new Employee(2, new EmployeeDTO("Shubham", 80000)));
        return employeeList;
    }

    @Override
    public Employee getEmployeeById(long id) {
        Employee employee = null;
        employee = new Employee(1,new EmployeeDTO("Avinash",20000));
        return employee;
    }

    @Override
    public Employee createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = null;
        employee = new Employee(1,employeeDTO);
        return employee;
    }

    @Override
    public Employee updateEmployee(EmployeeDTO employeeDTO) {
        Employee employee = null;
        employee = new Employee(1,employeeDTO);
        return employee;
    }

    @Override
    public void deleteEmployee(long Id) {

    }

    private List<Employee> employeeList = new ArrayList<>();
    public List<Employee> getEmployeeList() {
            return employeeList.stream()
                    .filter(employee -> employee.getId() == getEmployeeById())
                    .findFirst()
                    .orElseThrow(() -> new EmployeePayrollException("Employee Not Found"));


    }


//        @Override
//        public Employee getEmployeeById(long Id) {
//            return employeeList.findById(Id)
//                    .orElseThrow(() -> new EmployeePayrollException("Employee with EmployeeId" + Id
//                            + " Doesn't Exists...!"));
//    }
}
