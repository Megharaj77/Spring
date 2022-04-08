package com.training.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.training.jpademo.entity.Employee;
import java.util.List;
import java.util.Date;
import java.util.Optional;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

Employee findByEmail(String email);
List<Employee> findByName(String name);


List<Employee> findByNameOrEmail(String name,String email);
List<Employee>findByNameAndLevel(String name,int level);

List<Employee>findByNameIs(String name);
List<Employee>findByNameEquals(String name);

List<Employee>findByNameIsNot(String name);

List<Employee>findByNameStartsWith(String prefix);

List<Employee>findByNameEndingWith(String suffix);

List<Employee>findByNameIgnoreCase(String name);

List<Employee>findByNameLike(String pattern);

Employee findFirstByName(String name);
Employee findFirstByNameOrderByLevelAsc(String name);

List<Employee>findByEmailContaining(String infix);

Employee findFirstByOrderByEmail();


List<Employee>findByLevelLessThan(int level);
List<Employee>findByLevelLessThanEqual(int level);
List<Employee>findByLevelGreaterThan(int level);
List<Employee>findFirst2ByLevelOrderByBirthDateDesc(int level);

List<Employee>findByBirthDateBefore(Date before);
List<Employee>findByBirthDateAfter(Date after);
List<Employee>findByBirthDateBetween(Date start, Date end);

Employee findTopByOrderByBirthDateDesc();
}
