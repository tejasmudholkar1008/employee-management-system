package com.tejasjava.learning.springbooteg.service;

import com.tejasjava.learning.springbooteg.dto.EmployeeDTO;
import com.tejasjava.learning.springbooteg.entity.Employee;
import com.tejasjava.learning.springbooteg.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;


    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //GetAll
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    //Get By Id
    public Employee getEmployee(Integer id){
       return employeeRepository.findById(id).orElse(null);
    }

    //Create
    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    //Update
    public Employee updateEmployee(Integer id, Employee employee){


        Employee existingEmployee = employeeRepository
                .findById(id)
                .orElse(null);

        if (existingEmployee == null) {
            return null;
        }

        existingEmployee.setName(employee.getName());
        existingEmployee.setRole(employee.getRole());
        existingEmployee.setExperience(employee.getExperience());

        return employeeRepository.save(existingEmployee);
    }

    //Delete
    public boolean deleteEmployee(Integer id) {

        if (!employeeRepository.existsById(id)) {
            return false;
        }

        employeeRepository.deleteById(id);

        return true;
    }
}
