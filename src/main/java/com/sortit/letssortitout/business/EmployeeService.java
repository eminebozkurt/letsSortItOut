package com.sortit.letssortitout.business;

import com.sortit.letssortitout.dataAccess.EmployeeRepository;
import com.sortit.letssortitout.entities.Employee;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> saveAllEmployees(List<Employee> employees){
        return employeeRepository.saveAll(employees);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    public List<Employee> findAllEmployeesByIds(List<Integer> ids){
        return employeeRepository.findAllById(ids);
    }

    public List<Employee> findEmployeesByName(String employeeName){
        return employeeRepository.findByEmployeeName(employeeName);
    }


    public Employee findEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    public List<Employee> findByDepartmentAndAgeLessThan(String department,int age){
        return employeeRepository.findByDepartmentAndAgeLessThan(department,age);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
