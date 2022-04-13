package com.bridgelabz.employee.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDTO {
    private String message;
    private Object data;

    public ResponseDTO(String message, Object data){
        this.message = message;
        this.data = data;
    }

    public ResponseDTO(String delete_employee_data_for, String data, int empId) {
    }
}
