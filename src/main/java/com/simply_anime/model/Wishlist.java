package com.simply_anime.model;

import java.util.List;

import com.simply_anime.enums.StatusEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Wishlist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@OneToMany
	private List<Product> product;
	@OneToOne
	private Customer customer;
	@Enumerated(EnumType.STRING)
	private StatusEnum productStatus;
	
	//getter and setter
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public StatusEnum getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(StatusEnum productStatus) {
		this.productStatus = productStatus;
	}
	
	
}
