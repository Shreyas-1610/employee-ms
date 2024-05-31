package com.shreyas.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shreyas.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
