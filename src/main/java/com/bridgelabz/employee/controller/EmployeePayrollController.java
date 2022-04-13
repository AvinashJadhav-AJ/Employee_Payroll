package com.bridgelabz.employee.controller;

import com.bridgelabz.employee.dto.EmployeeDTO;
import com.bridgelabz.employee.dto.ResponseDTO;
import com.bridgelabz.employee.entity.Employee;
import com.bridgelabz.employee.service.EmployeePayrollService;
import com.bridgelabz.employee.service.EmployeePayrollServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employeepayrollservices")
@Slf4j
public class EmployeePayrollController {
    @Autowired
    private EmployeePayrollService employeePayrollService;

    /**
     *
     * @return
     */
    @RequestMapping(value = {"", "/", "/getemployee"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
        log.info("inside my controller");
        //Employee employee = null;
        List<Employee> employeeList = null;
        employeeList = employeePayrollService.getEmployeePayrollData();
       // employee = new Employee(1, new EmployeeDTO("Avinash", 800000));
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", employeeList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    /**
     *
     * @param empId
     * @return
     */
    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId) {
        Employee employee = null;
        employee = new Employee(1, new EmployeeDTO("Avinash", 800000));
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success for ID", employee);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    /**
     *
     * @param employeeDTO
     * @return
     */
    @PostMapping("/createemployee")
    public ResponseEntity<ResponseDTO> createEmployeeData(@Valid @RequestBody EmployeeDTO employeeDTO){
        Employee employee = null;
        employee = new Employee(1,  employeeDTO);
        ResponseDTO responseDTO = new ResponseDTO("Create Employee Data for", employee);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    /**
     *
     * @param employeeDTO
     * @param empId
     * @return
     */
    @PutMapping("/updateemployee/{empId}")
    public ResponseEntity<ResponseDTO> updateEmployeeData(@Valid @RequestBody EmployeeDTO employeeDTO, @PathVariable("empId") int empId){
        Employee employee = null;
        employee = new Employee(1, employeeDTO);
        ResponseDTO responseDTO = new ResponseDTO("Update Employee Data for", employee);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }


    /**
     *
     * @param empId
     * @return
     */
    @DeleteMapping("/deleteemployee/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId){
        ResponseDTO responseDTO = new ResponseDTO("Delete Employee Data for","Deleted Id: ", empId);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
