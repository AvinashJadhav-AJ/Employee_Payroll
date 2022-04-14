package com.bridgelabz.employee.service;

import com.bridgelabz.employee.dto.EmployeeDTO;
import com.bridgelabz.employee.entity.Employee;
import com.bridgelabz.employee.exception.EmployeePayrollException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollServiceImpl implements EmployeePayrollService {

//    @Autowired
//    EmployeeRepository employeeRepository;

    /**
     *
     * @return
     */
    @Override
    public List<Employee> getEmployeePayrollData() {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, new EmployeeDTO("Avinash", 20000)));
        employeeList.add(new Employee(2, new EmployeeDTO("Shubham", 80000)));
        return employeeList;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Employee getEmployeeById(long id) {
        Employee employee = null;
        if(id == 1) {
            employee = new Employee(1,new EmployeeDTO("Avinash",10000));
            return employee; }
        else {
            throw new EmployeePayrollException("Employee with Given ID Not Found."); }
    }

    /**
     *
     * @param employeeDTO
     * @return
     */
    @Override
    public Employee createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = null;
        employee = new Employee(1,employeeDTO);
        return employee;
    }

    /**
     *
     * @param employeeDTO
     * @return
     */
    @Override
    public Employee updateEmployee(EmployeeDTO employeeDTO) {
        Employee employee = null;
        employee = new Employee(1,employeeDTO);
        return employee;
    }

    /**
     *
     * @param Id
     */
    @Override
    public void deleteEmployee(long Id) {

    }

//    @Override
//    public Employee getEmployeeById(long empId) {
//         }
//    private List<Employee> employeeList = new ArrayList<>();
//    public List<Employee> getEmployeeList(long Id) {
//            return employeeList.stream()
//                    .filter(employee -> employee.getId() == getEmployeeById(Id))
//                    .findFirst()
//                    .orElseThrow(() -> new EmployeePayrollException("Employee Not Found"));
//
//
//    }
//
//
//        @Override
//        public Employee getEmployeeById(long Id) {
//            return employeeRepository.findById(Id);
////                    .orElseThrow(() -> new EmployeePayrollException("Employee with EmployeeId" + Id
////                            + " Doesn't Exists...!"));
//    }
}
