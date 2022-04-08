package com.training.jpademo.repository;

import java.util.List;



import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.training.jpademo.entity.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;
import java.util.Date;

@SpringBootTest
public class EmployeeRepositoryTests {
	@Autowired
	private EmployeeRepository employeeRepository;

//	@Test
//	public void saveEmployee() throws ParseException {
		
//		Employee reena = new Employee("Reena Bauer","reena_bauer70@gmail.com",2,new SimpleDateFormat("dd/MM/yyyy").parse("02/01/1999"));
//		employeeRepository.save(reena);
//		Employee raj = new Employee("Raj Chawanda","raj_chawanda@gmail.com",3,new SimpleDateFormat("dd/MM/yyyy").parse("09/12/1975"));
//		employeeRepository.save(raj);
//		Employee neil = new Employee("Neil Parks","neil_parks82@gmail.com",3,new SimpleDateFormat("dd/MM/yyyy").parse("13/07/2000"));
//		employeeRepository.save(neil);
//		Employee marcia = new Employee("Marcia Lin","marcia_lin89@gmail.com",4,new SimpleDateFormat("dd/MM/yyyy").parse("25/03/1995"));
//		employeeRepository.save(marcia);
//		Employee rayan = new Employee("Rayan Stato","rayan_stato@gmail.com",4,new SimpleDateFormat("dd/MM/yyyy").parse("28/02/1998"));
//		employeeRepository.save(rayan);
//		Employee kyra = new Employee("Kyra Weiss","kyra_weiss@gmail.com",3,new SimpleDateFormat("dd/MM/yyyy").parse("23/09/1992"));
//		employeeRepository.save(kyra);
//		Employee marcia_lin = new Employee("Marcia Lin","marcia_lin@gmail.com",2,new SimpleDateFormat("dd/MM/yyyy").parse("09/11/1994"));
//		employeeRepository.save(marcia_lin);
//}
//@Test
//	public void findByEmailOrName() {
//		System.out.println("\n**************************");
//		System.out.println("\nRetrieving Employees by name or email:");
//		
//		System.out.println("\nBoth name and email match");
//		List<Employee> empByNameOrEmail=employeeRepository.findByNameOrEmail("Neil Parks", "neil_parks82@gmail.com");
//		System.out.println("Returned data:"+empByNameOrEmail.toString());
//		
//		System.out.println("\nOnly name matches");
//		empByNameOrEmail=employeeRepository.findByNameOrEmail("Neil Parks","neil_parks2gmail.com");
//		System.out.println("Returned data:"+empByNameOrEmail.toString());
//		
//		System.out.println("\nOnly Email Matches");
//		empByNameOrEmail=employeeRepository.findByNameOrEmail("Neil Gardner", "neil_parks82@gmail.com");
//		System.out.println("\nReturned data:"+empByNameOrEmail.toString());
//		
//		System.out.println("\nNeither name nor email match");
//		empByNameOrEmail=employeeRepository.findByNameOrEmail("Neil gardner","neil_parks@gmail.com");
//		System.out.println("\nReturned data:"+empByNameOrEmail.toString());
//		
//		System.out.println("\nName and Email matches different");
//		empByNameOrEmail=employeeRepository.findByNameOrEmail("Neil Parks","reena_bauer70@gmail.com");
//		System.out.println("Returned data:"+empByNameOrEmail.toString());
//		
//		System.out.println("\n*******************************");
//		
//	}
//	@Test
//	public void find() {
//		System.out.println("\n************************************");
//		System.out.println("\nRetrieving Employees by name And level");
//		
//		System.out.println("\nName and level match 1 employee");
//		List<Employee>empByNameAndLevel=employeeRepository.findByNameAndLevel("Marcia Lin",4);
//		System.out.println("\nReturned data:"+empByNameAndLevel.toString());
//		
//		System.out.println("\nName and level 0 Match");
//		empByNameAndLevel=employeeRepository.findByNameAndLevel("Marcia Lin",5);
//		System.out.println("Returned Data:"+empByNameAndLevel.toString());
//		
//		System.out.println("\n**********************");
//		System.out.println("\nRetrieving Employee by Nmae");
//		
//		System.out.println("\nfindByName");
//		List<Employee>empByName=employeeRepository.findByName("Raj Chawanda");
//		System.out.println("Returned data:"+empByName.toString());
//		
//		System.out.println("\nfindByNameIs");
//		List<Employee>empByNameIs=employeeRepository.findByNameIs("Raj Chawanda");
//		System.out.println("\nReturned data:"+empByNameIs.toString());
//		
//		System.out.println("\nfindNameEquals");
//		empByName=employeeRepository.findByNameEquals("Raj Chawanda");
//		System.out.println("Returned data: "+empByName.toString());
//		
//		System.out.println("\nfindByNameIsNot");
//		empByName=employeeRepository.findByNameIsNot("Raj Chawanda");
//		System.out.println("Returned data:"+empByName.toString());
//	}
	
//	@Test
//	public void pattern() {
//		System.out.println("\n*********************");
//		System.out.println("\nRetrieving Employee by name");
//		
//		System.out.println("\nfindByNameStartsWith");
//		List<Employee>empByName=employeeRepository.findByNameStartsWith("R");
//		System.out.println("Returned data: "+empByName.toString());
//		
//		System.out.println("\nfindByNameEndingWith");
//		empByName=employeeRepository.findByNameEndingWith("Lin");
//		System.out.println("Returned data: "+empByName.toString());
//		
//		System.out.println("\nfindByIgnoreCase");
//		empByName=employeeRepository.findByNameIgnoreCase("reenE bauer");
//		System.out.println("Returned data: "+ empByName.toString());
//		
//		System.out.println("\nfindByNameLike");
//		empByName=employeeRepository.findByNameLike("%weis%");
//		System.out.println("Returned data: "+empByName.toString());
//		
//		System.out.println("\nfindFirstByName");
//		Employee emp=employeeRepository.findFirstByName("Marcia Lin");
//		System.out.println("Returned data: "+emp.toString());
//		
//		System.out.println("\nfindFirstByNameOrderByLevelAsc");
//		emp=employeeRepository.findFirstByNameOrderByLevelAsc("Marcia Lin");
//		System.out.println("Returned data: "+emp.toString());
//		
//		System.out.println("\n***************************");
//		System.out.println("\nRetrieving Employee by email");
//		
//		System.out.println("\nfindByEmailContainin");
//		List<Employee>empByEmail=employeeRepository.findByEmailContaining("ar");
//		System.out.println("Returned data: "+empByEmail.toString());
//		
//		System.out.println("\nfindFirstByOrderByEmail");
//		Employee empByEmail1=employeeRepository.findFirstByOrderByEmail();
//		System.out.println("Returned data: "+empByEmail1.toString());
//		
//	}
	
	@Test
	public void findLevel() throws ParseException {
		System.out.println("\n**************************");
		System.out.println("\nRetrieving Employee by level");
		
		System.out.println("\nfindByLevelLessThan");
		List<Employee>emp=employeeRepository.findByLevelLessThan(3);
		System.out.println("Returned data:"+emp.toString());
		
		System.out.println("\nfindByLevelLessThanEqual");
		emp=employeeRepository.findByLevelLessThanEqual(3);
		System.out.println("Returned data:"+emp.toString());
		
		System.out.println("\nfindByLevelGreaterThan");
		emp=employeeRepository.findByLevelGreaterThan(3);
		System.out.println("Returned data:"+emp.toString());
		
		System.out.println("\nfindFirst2ByOrderByBirthDateDesc");
		emp=employeeRepository.findFirst2ByLevelOrderByBirthDateDesc(3);
		System.out.println("Returned data: "+emp.toString());
		
		System.out.println("\n*************************************");
		System.out.println("\nRetrieving Employee by birth date");
		
		Date refDate=new SimpleDateFormat("dd/mm/yyyy").parse("08/05/1994");
		
		System.out.println("\nfindByBirthDateBefore");
		emp=employeeRepository.findByBirthDateBefore(refDate);
		System.out.println("Returned data: "+emp.toString());
		
		System.out.println("\nfindByBirthDateAfter");
		emp=employeeRepository.findByBirthDateAfter(refDate);
		System.out.println("Returned data: "+emp.toString());
		
		System.out.println("\nfindByBirthDateBetween");
		Date startDate =new SimpleDateFormat("dd/mm/yyyy").parse("01/01/1988");
		emp=employeeRepository.findByBirthDateBetween(startDate,refDate);
		System.out.println("Returned data: "+emp.toString());
		
		System.out.println("\nfindTopByOrderByBirthDateDesc");
		Employee emp1=employeeRepository.findTopByOrderByBirthDateDesc();
		System.out.println("Returned data:"+emp.toString());
	}
}
