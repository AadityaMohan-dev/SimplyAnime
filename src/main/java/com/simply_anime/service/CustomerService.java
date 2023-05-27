package com.simply_anime.service;
import java.security.Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.simply_anime.dto.ReqCustomerDto;
import com.simply_anime.dto.ResCustomerDto;
import com.simply_anime.enums.CustomerStatus;
import com.simply_anime.model.Customer;
import com.simply_anime.repository.CustomerRepository;
import com.simply_anime.repository.UserRepository;


@Service
public class CustomerService {
	
	@Autowired
	private  PasswordEncoder passwordEncoder;
	
	@Autowired
	private  UserRepository userRepository;
	
	@Autowired
	private  CustomerRepository customerRepository;
	
	@Autowired
	private ResCustomerDto resCustomerDto;
	
	
	//add Customer
	
	public  ResponseEntity<Object> addCustomer(ReqCustomerDto rcd){
		com.simply_anime.model.User user = new com.simply_anime.model.User();
		user.setUsername(rcd.getUsername());
		user.setPassword(rcd.getPassword());
		user.setRole("CUSTOMER");
		String encodePassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodePassword);
		user = userRepository.save(user);
		
		Customer customer = new Customer();
		customer.setAddress(rcd.getAddress());
		customer.setContact(rcd.getContact());
		customer.setEmail(rcd.getEmail());
		customer.setName(rcd.getName());
		customer.setUser(user);
		
		customerRepository.save(customer);
		return ResponseEntity.status(HttpStatus.OK).body("Customer Added Sucessfully");
		
	}

	//Show All Customers Details

	public ResponseEntity<Object> getAllCustomer(CustomerRepository cur) {
		// TODO Auto-generated method stub
		List<Customer> list = cur.findAll();
		List<ResCustomerDto> listdto = new ArrayList<>();
		
		for(Customer c : list) {
			ResCustomerDto dto = new ResCustomerDto();
			dto.setAddress(c.getAddress());
			dto.setContact(c.getContact());
			dto.setEmail(c.getEmail());
			dto.setId(c.getId());
			dto.setName(c.getName());
			dto.setUsername(c.getUser().getUsername());
			
			listdto.add(dto);
			
		}
		return ResponseEntity.status(HttpStatus.OK).body(listdto);
	}


	//Show Customer By Id
	public ResponseEntity<Object> getCustomerById(CustomerRepository cur ,long id){
		Optional<Customer> optional = cur.findById(id);
		if(optional.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Incorrect Id");
		}
		Customer customer = optional.get();
		resCustomerDto.setAddress(customer.getAddress());
		resCustomerDto.setContact(customer.getContact());
		resCustomerDto.setEmail(customer.getEmail());
		resCustomerDto.setId(customer.getId());
		resCustomerDto.setName(customer.getName());
		resCustomerDto.setUsername(customer.getUser().getUsername());
		
		return  ResponseEntity.status(HttpStatus.OK).body(resCustomerDto);
		
	}
	
		//Show Customer By UserName
	
		public ResponseEntity<Object> getCustomerByUserName(CustomerRepository cur ,String username){
			Optional<Customer> optional = cur.findByUserName(username);
			if(optional.isEmpty()) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Incorrect Id");
			}
			Customer customer = optional.get();
			resCustomerDto.setAddress(customer.getAddress());
			resCustomerDto.setContact(customer.getContact());
			resCustomerDto.setEmail(customer.getEmail());
			resCustomerDto.setId(customer.getId());
			resCustomerDto.setName(customer.getName());
			resCustomerDto.setUsername(customer.getUser().getUsername());
			
			return  ResponseEntity.status(HttpStatus.OK).body(resCustomerDto);
			
		}

		
		//Archive or Delete Customer Details (for Archive we have to add status column in 
		//Customer  than change status from available to archive)
		
		public ResponseEntity<Object> delAccount(Principal principal){
			String username = principal.getName();
			Optional<Customer> optional = customerRepository.findByUserName(username);
			Customer customer = optional.get();
			
			//user already login thats why we don't use if condition here.
			
//			if(optional.isEmpty()) {
//				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad Request");
//			}
//			
			customer.setStatus(CustomerStatus.ARCHIVE);
			customerRepository.save(customer);
			return ResponseEntity.status(HttpStatus.OK).body("Account Deleted Successfully.");
		}
		
		
	

}

