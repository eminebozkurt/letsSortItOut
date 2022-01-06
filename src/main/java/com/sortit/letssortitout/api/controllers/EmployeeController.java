package com.sortit.letssortitout.api.controllers;

import com.sortit.letssortitout.business.EmployeeService;
import com.sortit.letssortitout.entities.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("employee")
@Validated
public class EmployeeController {
    private final EmployeeService employeeService;
    private final String NOT_VALID_ID = "Employee ID should be greater than 0!";

    @PostMapping("addemployee")
    public Employee addEmployee(@Valid @RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    } 

    @PostMapping("addemployees")
    public List<Employee> addAllEmployees(@RequestBody List<Employee> employees){
        return employeeService.saveAllEmployees(employees);
    }

    @GetMapping("allemployees")
    public List<Employee> getAllEmployees(){
        return employeeService.findAllEmployees();
    }

    @GetMapping("employeewithname")
    public List<Employee> getAllEmployeesWithName(@RequestParam String employeeName){
        return employeeService.findAllEmployees();
    }

    @GetMapping("employeebyid")
    public Employee getEmployeeById(@RequestParam @Min(value=1,message = NOT_VALID_ID) int id){
        return  employeeService.findEmployeeById(id);
    }

    @GetMapping("findbydepartmentandagelessthan")
    public List<Employee> findByDepartmentAndAgeLessThan(@RequestParam String department,@RequestParam int age){
        return employeeService.findByDepartmentAndAgeLessThan(department,age);
    }


}
