package com.bikki.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikki.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
