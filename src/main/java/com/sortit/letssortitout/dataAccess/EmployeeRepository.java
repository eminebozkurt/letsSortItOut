package com.sortit.letssortitout.dataAccess;

import com.sortit.letssortitout.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Employee findById(int id);
    List<Employee> findByEmployeeName(String employeeName);
    List<Employee> findByDepartmentAndAgeLessThan(String department,int age);

    List<Employee> findByDepartmentAndAgeLessThanEqual(String department, int age);

    List<Employee> findByEmployeeNameStartingWith(String employeeName);

    List<Employee> findByEmployeeNameContaining(String employeeName);

    List<Employee> findByEmployeeNameEndingWith(String employeeName);

    List<Employee> findTop5ByAge(int age);
    List<Employee> findByAgeBetween(int startAge, int endAge);
    List<Employee> findByAgeIn(List<Integer> ages);
    List<Employee> findByAgeNotIn(List<Integer> ages);

    List<Employee> findByJoiningDateAfter(Date date);
    List<Employee> findByJoiningDateBefore(Date date);
    List<Employee> findByJoiningDateBetween(Date startDate, Date endDate);
    List<Employee> findByJoiningDateBetweenAndDepartment(Date startDate, Date endDate, String department);

    List<Employee> findByLeftOnIsNull();

    List<Employee> findByEmployeeNameEquals(String employeeName);
    List<Employee> findByEmployeeNameIsNot(String employeeName);
    List<Employee> findByEmployeeNameIsNull();
    List<Employee> findByEmployeeNameIsNotNull();

    List<Employee> findByEmployeeNameOrderByJoiningDateAsc(String employeeName);
    List<Employee> findByEmployeeNameOrderByAgeDesc(String employeeName);

    List<Employee> findByLeftJobTrue();
    List<Employee> findByLeftJobIsFalse();
    List<Employee> findByLeftJob(boolean leftJobStatus);


}
