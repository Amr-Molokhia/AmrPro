package com.X.AmrPro.service.Interface;

import com.X.AmrPro.buisness.DTO.EmployeeDTO;
import com.X.AmrPro.buisness.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee addEmployee(EmployeeDTO employeeDTO);
    public List<Employee> getEmployee();
    public Employee getEmployee(long Id);

    public Employee deleteEmployee(long Id);

    public Employee updateEmployee(long Id, EmployeeDTO employeeDTO);
}
