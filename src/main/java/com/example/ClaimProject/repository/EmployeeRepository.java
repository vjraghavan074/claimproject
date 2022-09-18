package com.example.ClaimProject.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.ClaimProject.model.Employee;

@Repository
public class EmployeeRepository {
	
	private Map<Integer,Employee> employeeMap = new HashMap<>();
	
	public void createEmployee() {
		Employee emp1 = new Employee(1, "Gautham", "Developer");
        Employee emp2 = new Employee(2,"Vijay","Tester");
        Employee emp3 = new Employee(3,"Vishnu", "Hacker");
        
        employeeMap.put(emp1.getEmpId(), emp1);
        employeeMap.put(emp2.getEmpId(), emp2);
        employeeMap.put(emp3.getEmpId(), emp3);

    }
	
//	public Employee getEmployeeById(int empId) {
//        return employeeMap.get(employeeMap);
//    }

	public Employee getEmployeeById(int empId){
		for (Integer key: employeeMap.keySet()){  
			 employeeMap.get(key);
		} 
        return null;
    }
}
