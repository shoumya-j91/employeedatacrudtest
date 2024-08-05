package com.employeedata.crudtest.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Employee {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;
    private String employeeName;
    private String employeeAddress;


    public Employee(Long employeeId, String employeeName, String employeeAddress) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
    }

    public Employee() {
    }
}
