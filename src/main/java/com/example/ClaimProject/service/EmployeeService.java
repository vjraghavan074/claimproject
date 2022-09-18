package com.example.ClaimProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ClaimProject.model.Employee;
import com.example.ClaimProject.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;
	
	 public Employee getEmployeeById(int empId) {
	        return empRepo.getEmployeeById(empId);
	    }
	
	
}
