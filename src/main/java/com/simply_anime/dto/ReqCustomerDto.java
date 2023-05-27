package com.simply_anime.dto;

import org.springframework.stereotype.Component;

@Component
public class ReqCustomerDto {
	
	private String name;
	private String email;
	private String contact;
	private String address;
	private String username;
	private String password;
	
	public ReqCustomerDto() {
		
	}

	public ReqCustomerDto(String name, String email, String contact, String address, String username, String password) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.address = address;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "ReqCustomerDto [name=" + name + ", email=" + email + ", contact=" + contact + ", address=" + address
				+ ", username=" + username + ", password=" + password + "]";
	}

}
