package com.training.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.training.jpademo.entity.Employee;
import java.util.List;
import java.util.Optional;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

//	Employee findByName(String name);
	Employee findByEmail(String email);
	Optional<List<Employee>>findByName(String name);
	
}
