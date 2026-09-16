package com.tejasjava.learning.springbooteg.repository;

import com.tejasjava.learning.springbooteg.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
