package com.X.AmrPro.controler;

import com.X.AmrPro.buisness.DTO.EmployeeDTO;
import com.X.AmrPro.buisness.entity.Employee;
import com.X.AmrPro.service.Interface.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/Add")
    public ResponseEntity<Employee> addEmployee(@RequestBody final EmployeeDTO employeeDTO) {
        Employee employee = employeeService.addEmployee(employeeDTO);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable final long id) {
        Employee employee = employeeService.getEmployee(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getEmployee() {
        List<Employee> employee = employeeService.getEmployee();
        return new ResponseEntity<List<Employee>>(employee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable final long id) {
        Employee employee = employeeService.deleteEmployee(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/edit/id")
    public ResponseEntity<Employee> editEmployee(@RequestBody final EmployeeDTO employeeDTO,@PathVariable final long id) {
        Employee employee = employeeService.updateEmployee(id,employeeDTO);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
}