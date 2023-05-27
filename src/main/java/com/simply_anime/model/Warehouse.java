package com.simply_anime.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


@Entity
public class Warehouse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@OneToMany
	@JoinColumn(name = "fk_product")
	private List<Product> product;
	private long qunatity;
	
	//getter and setter;
	
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
	public long getQunatity() {
		return qunatity;
	}
	public void setQunatity(long qunatity) {
		this.qunatity = qunatity;
	}
	
}
