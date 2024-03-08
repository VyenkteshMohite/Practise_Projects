package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.exception.ResourceNotFoundException;
import com.demo.model.Employee;
import com.demo.repository.EmployeeRepository;

import java.util.List;

@CrossOrigin("*")
@RestController		
@RequestMapping("/api/v1/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
	
	//Build Create Employee RESTAPT
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		
		return employeeRepository.save(employee);
	}
	
	//building get employee by id RESTAPI
	@GetMapping("{id}")
	//we nedd to bind the id with method argument with @PathVaribale
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int id){
		
		Employee employee=employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee Not Exists With Id: "+id));
		return ResponseEntity.ok(employee); 
		//to fetch employee object from the database we are using employee repository
		//here find by id provides an optional class and provides or else throw method
		// the orElseThrow Will throw the exception if the id is not found so the error is thrown
		//supplier is an functional interface
		//Ok method will provide the status code 200 internally so there is not need to provide manually
		//so here we have to pass the body as employee obj
		//to make an rest api for this method we need to annotate it as
	}

}
