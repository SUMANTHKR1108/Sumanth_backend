package com.excel.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.entity.EmployeeContactInfo;

public interface EmployeeContactRepository extends JpaRepository<EmployeeContactInfo, Integer>{

}
