package com.employeedata.crudtest.service;

import com.employeedata.crudtest.model.Employee;

import java.util.List;

public interface IEmployeeService {



    Employee saveEmployee(Employee emplpyee);


    List<Employee> fetchEmployeeList();
    Employee updateEmployee(Employee employee, Long employeeId);
    void deleteEmployeebyId(Long employeeId);


}
