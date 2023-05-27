package com.simply_anime.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.simply_anime.enums.OrderStatusEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int orderNumber;
	@Enumerated(EnumType.STRING)
	private OrderStatusEnum orderStatus;
	private LocalDateTime orderDateTime;
	@OneToMany
	private List<Cart> cartItem = new ArrayList<>();
	@ManyToOne
	private Customer customer;
	
	//getter and setter
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public OrderStatusEnum getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatusEnum orderStatus) {
		this.orderStatus = orderStatus;
	}
	public LocalDateTime getOrderDateTime() {
		return orderDateTime;
	}
	public void setOrderDateTime(LocalDateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
	}
	
	public List<Cart> getCartItem() {
		return cartItem;
	}
	public void setCartItem(List<Cart> cartItem) {
		this.cartItem = cartItem;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}
