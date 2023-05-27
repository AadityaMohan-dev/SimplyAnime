package com.simply_anime.controller;
import java.security.Principal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simply_anime.dto.ReqCustomerDto;
import com.simply_anime.repository.CustomerRepository;
import com.simply_anime.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	@Autowired
	private CustomerRepository cur;
	
	
	//CURD OPERATIONS
	
	//C -- > Create 
	
	@PostMapping("/add")
	public ResponseEntity<Object> addCustomer(@RequestBody ReqCustomerDto rcd){
		return customerService.addCustomer(rcd);
		
	}
	
	//R --> Read
	
	@GetMapping("/details")
	public ResponseEntity<Object> getAllCustomer(){
		return customerService.getAllCustomer(cur);
	}
	
	@GetMapping("/details/{id}")
	public ResponseEntity<Object> getCustomerById(@PathVariable("id")long id){
		return customerService.getCustomerById(cur, id);
	}
	
	@GetMapping("/details/{username}")
		public ResponseEntity<Object> getCustomerByUserName(@PathVariable("username")String username){
			return customerService.getCustomerByUserName(cur, username);
	}
		
	//D --> Delete(Archive)
	
	@DeleteMapping("/delete")
	public ResponseEntity<Object> delCustomer(Principal principal){
		return customerService.delAccount(principal);
	}
	
	

}
