package com.simply_anime.dto;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ResCartDto {
	
	private Long id;
	private List<ResProductDto> products;
	private int cartQuantity;
	private double cartAmount;
	
	public ResCartDto() {
		
	}

	public ResCartDto(Long id, List<ResProductDto> products, int cartQuantity, double cartAmount) {
		super();
		this.id = id;
		this.products = products;
		this.cartQuantity = cartQuantity;
		this.cartAmount = cartAmount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ResProductDto> getProducts() {
		return products;
	}

	public void setProducts(List<ResProductDto> products) {
		this.products = products;
	}

	public int getCartQuantity() {
		return cartQuantity;
	}

	public void setCartQuantity(int cartQuantity) {
		this.cartQuantity = cartQuantity;
	}

	public double getCartAmount() {
		return cartAmount;
	}

	public void setCartAmount(double cartAmount) {
		this.cartAmount = cartAmount;
	}

	@Override
	public String toString() {
		return "ResCartDto [id=" + id + ", products=" + products + ", cartQuantity=" + cartQuantity + ", cartAmount="
				+ cartAmount + "]";
	}
	
}
