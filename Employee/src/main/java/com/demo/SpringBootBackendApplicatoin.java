package com.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.model.Employee;
import com.demo.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBootBackendApplicatoin implements CommandLineRunner {


	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootBackendApplicatoin.class, args);

	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
	
		Employee emp1 = new Employee();
//		
////		emp.setId(0);
//		emp1.setFirstName("Vyenktesh1");
//		emp1.setLastName("Mohite1");
//		emp1.setEmailId("Venkey1123@gmail.com");
//		employeeRepository.save(emp1);
//		
//			Employee emp11 = new Employee();
////		emp1.setId(1); 	
//		emp11.setFirstName("Raj1");
//		emp11.setLastName("Lohar1");
//		emp11.setEmailId("RajLohar1@gmail.com");
//		employeeRepository.save(emp11);
//		
	} 
	
	
}
