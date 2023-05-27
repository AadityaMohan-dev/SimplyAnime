package com.simply_anime.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.simply_anime.dto.ReqAdminDto;
import com.simply_anime.model.Admin;
import com.simply_anime.model.User;
import com.simply_anime.repository.AdminRepository;
import com.simply_anime.repository.UserRepository;

@Service
public class AdminService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private AdminRepository adminRepository;
	
	public ResponseEntity<Object> addAdmin(ReqAdminDto rad) {
		
		User user = new User();
		user.setUsername(rad.getUsername());
		user.setPassword(rad.getPassword());
		user.setRole("ADMIN");
		String encodePassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodePassword);
		user = userRepository.save(user);
		
		Admin admin = new Admin();
		admin.setName(rad.getName());
		admin.setUser(user);
		
		adminRepository.save(admin);
		
		return ResponseEntity.status(HttpStatus.OK).body("Admin Added Sucessfully");
	}

}
