package com.excel.springhibernate;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

@Component("employeeDao")
public class EmployeeDaoImplem implements EmployeeDao{
	@Autowired
	HibernateTemplate hibernateTemplate;

	
	@Transactional
	@Override
	public int insertEmployee(Employee employee) {
		
		String query="insert into springhibernate(employee_id,employee_name,employee_address) values(?,?,?)";
		return (int) hibernateTemplate.save(employee);
	}


	@Transactional
	
	public Employee updateEmployee(Employee employee) {
	   hibernateTemplate.saveOrUpdate(employee);
		return employee;
	}

	@Transactional
	@Override
	public Employee getEmployee(int id) {
		Employee employee=this.hibernateTemplate.get(Employee.class,id);
		return employee;
	}

   @Transactional
	public Employee deleteEmployee(int id) {
	   Employee employee=this.hibernateTemplate.get(Employee.class,id);
		this.hibernateTemplate.delete(employee);
		return employee;
	}

@Transactional
@Override
public List<Employee> getAllEmployee() {
	List<Employee>employees=this.hibernateTemplate.loadAll(Employee.class);
	return employees;
	
}
}

