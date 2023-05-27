package com.simply_anime.model;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int cartQuantity;
	
	@OneToMany
	private List<Product> product;
	
	private double cartAmount;
	
	//getter and setter
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getCartQuantity() {
		return cartQuantity;
	}
	public void setCartQuantity(int cartQuantity) {
		this.cartQuantity = cartQuantity;
	}
	public List<Product> getProduct() {
		if(product == null) {
			product = new ArrayList<>();
		}
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public double getCartAmount() {
		return cartAmount;
	}
	public void setCartAmount(double cartAmount) {
		this.cartAmount = cartAmount;
	}
	

	public String toString() {
		return "Cart [id=" + id + ", cartQuantity=" + cartQuantity + ", product=" + product + ", cartAmount="
				+ cartAmount + "]";
	}
	
	public void computeCartTotals() {
		cartQuantity = product.stream().mapToInt(Product::getQuantity).sum();
		cartAmount = product.stream().mapToDouble(p -> p.getUnitPrice() * p.getQuantity()).sum();
	}
	

}
