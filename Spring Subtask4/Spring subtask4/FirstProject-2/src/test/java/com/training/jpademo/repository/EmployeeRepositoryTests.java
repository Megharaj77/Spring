package com.training.jpademo.repository;

import java.util.List;
import java.util.Optional;

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
		
	Employee reena= new Employee("Reena Bauer","reena_bauer70@gmail.com");	
	Employee raj= new Employee("Raj Chawanda","raj_chawanda@gmail.com");
	Employee neil= new Employee("Neil Parks","neil_parks82@gmail.com");
	Employee marcia= new Employee("Marcia Lin","marcia_lin89@gmail.com");
	Employee rayan= new Employee("Rayan Stato","rayan_stato@gmail.com");
	Employee kyra= new Employee("kyra Weiss","kyra_weiss@gmail.com");
	employeeRepository.save(reena);
	employeeRepository.save(raj);
	employeeRepository.save(neil);
	employeeRepository.save(marcia);
	employeeRepository.save(rayan);
	employeeRepository.save(kyra);
	
}
//	@Test
//	public void allRows() {
//		System.out.println("\n********");
//		System.out.println("\nRetrieveing all employee data...\n");
//	for(Employee em : employeeRepository.findAll()){
//	System.out.println(em.toString());
//	}
//}
//	@Test
//	public void oneEmployee() {
//		System.out.println("\n***********************");
//		System.out.println("\n Retriveing data of one employee");
//		Employee em=employeeRepository.findById(16L).get();
//		System.out.println(em.toString());
//		System.out.println("\n**************************");
//	}
//	@Test
//	public void employeeByEmail() {
//		System.out.println("\n********************");
//		System.out.println("\n Retriveing employee by email");
//		Employee employeeByEmail=employeeRepository.findByEmail("marcia_lin89@gmail.com");
//		System.out.println(employeeByEmail.toString());
//	}
//	@Test
//	public void listName() {
////		Employee marcia= new Employee("Marcia Lin","marcia_lin89@gmail.com");
////		employeeRepository.save(marcia);
//		System.out.println("\n********************");
//		System.out.println("\n Retriveing employee by name list");
//		Optional<List<Employee>> employeeByName=employeeRepository.findByName("Loony corn");
//		System.out.println(employeeByName.toString());
//	}
//	@Test
//	public void update() {
//		Optional<List<Employee>> emp=employeeRepository.findByEmail("marcia_lin89@gmail.com");
//		
//		if(emp.isPresent()) {
//			Employee retrievedEmp=(Employee)emp.get();
//			retrievedEmp.setEmail("marcia-lin88@gmail.com");
//			employeeRepository.save(retrievedEmp);
//			System.out.println(retrievedEmp.toString());
//		}
//	@Test
//	public void delete() {
////		employeeRepository.deleteById(20L);
//		employeeRepository.deleteAll();
//	}
//	
	
}
