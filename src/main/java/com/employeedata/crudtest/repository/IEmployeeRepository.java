package com.employeedata.crudtest.repository;

import com.employeedata.crudtest.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepository extends CrudRepository<Employee, Long> {
}
