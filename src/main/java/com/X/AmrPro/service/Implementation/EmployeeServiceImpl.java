package com.X.AmrPro.service.Implementation;

import com.X.AmrPro.buisness.DTO.EmployeeDTO;
import com.X.AmrPro.buisness.entity.Employee;
import com.X.AmrPro.buisness.mapper.EmployeeMapper;
import com.X.AmrPro.repository.EmployeeRepository;
import com.X.AmrPro.service.Interface.EmployeeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
   private final EmployeeMapper employeeMapper;
   private final EmployeeRepository employeeRepository;
@Autowired
    public EmployeeServiceImpl(EmployeeMapper employeeMapper, EmployeeRepository employeeRepository) {
        this.employeeMapper = employeeMapper;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee addEmployee(EmployeeDTO employeeDTO) {

        return employeeRepository.save(employeeMapper.toEntity(employeeDTO));

    }
//get all without pagination ?nor exception not found or status http
    @Override
    public List<Employee> getEmployee() {
    List<Employee> employees = new ArrayList<>();
    employeeRepository.findAll().forEach(employees::add);
    return employees;
    }
//no status
    @Override
    public Employee getEmployee(long Id) {
        return employeeRepository.findById(Id).orElseThrow(()->
                {throw new IllegalArgumentException("employee not found");});
    }
    @Override
    public Employee deleteEmployee(long Id) {
    Employee employee = getEmployee(Id);
    employeeRepository.delete(employee);
    return employee;
    }
    @Transactional
    @Override
    public Employee updateEmployee(long Id, EmployeeDTO employeeDTO) {
    Employee employeeEdit = getEmployee(Id);
    employeeEdit.setName(employeeDTO.getName());
    employeeEdit.setAge(employeeDTO.getAge());
    return employeeEdit;
    }
}
