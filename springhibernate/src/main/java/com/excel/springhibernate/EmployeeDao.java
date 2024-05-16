package com.excel.springhibernate;


import java.util.List;

public interface EmployeeDao {
public int insertEmployee(Employee employee);
public Employee updateEmployee(Employee employee);
Employee getEmployee(int id);
Employee deleteEmployee(int id);
public List<Employee>getAllEmployee();
}
