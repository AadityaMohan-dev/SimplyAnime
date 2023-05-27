package com.simply_anime.dto;

import org.springframework.stereotype.Component;

@Component
public class ResCustomerDto {
	
	private long id;
	private String name;
	private String email;
	private String contact;
	private String address;
	private String username;
	
	public ResCustomerDto() {
		
	}

	public ResCustomerDto(long id, String name, String email, String contact, String address, String username) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.address = address;
		this.username = username;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "ResCustomerDto [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact
				+ ", address=" + address + ", username=" + username + "]";
	}
	
}
