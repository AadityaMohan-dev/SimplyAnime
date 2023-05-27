package com.simply_anime.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String productName;
	private String prductDiscription;
	private long currentStock;
	private int quantity;
	private double unitPrice;
	@OneToOne
	private Category category;
	private boolean liked ;
	
	
	//getter and setter
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPrductDiscription() {
		return prductDiscription;
	}
	public void setPrductDiscription(String prductDiscription) {
		this.prductDiscription = prductDiscription;
	}
	public long getCurrentStock() {
		return currentStock;
	}
	public void setCurrentStock(long currentStock) {
		this.currentStock = currentStock;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public boolean isLiked() {
		return liked;
	}
	public void setLiked(boolean liked) {
		this.liked = liked;
	}
	
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", prductDiscription=" + prductDiscription
				+ ", currentStock=" + currentStock + ", quantity=" + quantity + ", unitPrice=" + unitPrice
				+ ", category=" + category + ", liked=" + liked + "]";
	}

}
