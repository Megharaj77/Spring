package com.training.jpademo.repository;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import com.training.jpademo.entity.Employee;

@SpringBootTest
public class EmployeeRepositoryTests {
	
@Autowired
private EmployeeRepository employeeRepository;

@Test
public void saveEmployee() {
	Employee richard =new Employee("Richard",2);
	employeeRepository.save(richard);
	Employee reene=new Employee("Reene Bauer",3);
	employeeRepository.save(reene);
}

}
