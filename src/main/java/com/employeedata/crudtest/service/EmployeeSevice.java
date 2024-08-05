package com.employeedata.crudtest.service;

import com.employeedata.crudtest.model.Employee;
import com.employeedata.crudtest.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class EmployeeSevice implements IEmployeeService{

     @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee emplpyee) {
        return employeeRepository.save(emplpyee);
    }

    @Override
    public List<Employee> fetchEmployeeList() {
        return (List<Employee>) employeeRepository.findAll();

    }

    @Override
    public Employee updateEmployee(Employee employee, Long employeeId) {

        Employee empdb=employeeRepository.findById(employeeId).get();
      /*  if(Objects.nonNull(employee.getEmployeeId()) && ! "".equalsIgnoreCase(employee.getEmployeeId()))
        {

        }*/
        if(Objects.nonNull(employee.getEmployeeName()) && !"".equalsIgnoreCase(
                employee.getEmployeeName()))

        {
            empdb.setEmployeeName(employee.getEmployeeName());

      }
        if(Objects.nonNull(
                employee.getEmployeeAddress())&& !"" .equalsIgnoreCase(employee.getEmployeeAddress())
        )
        {
            empdb.setEmployeeAddress(employee.getEmployeeAddress());
        }

        return employeeRepository.save(empdb);
    }

    @Override
    public void deleteEmployeebyId(Long employeeId) {


        employeeRepository.deleteAllById(Collections.singleton(employeeId));
    }
}
