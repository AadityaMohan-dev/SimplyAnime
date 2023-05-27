package com.simply_anime.dto;

import org.springframework.stereotype.Component;

@Component
public class ReqProductDto {
	
	private String productName;
	private String prductDiscription;
	private long currentStock;
	private int quantity;
	private double unitPrice;
	private long categoryId;
	private boolean liked;
	
	public ReqProductDto() {
		
	}

	public ReqProductDto(String productName, String prductDiscription, long currentStock, int quantity,
			double unitPrice, long categoryId, boolean liked) {
		super();
		this.productName = productName;
		this.prductDiscription = prductDiscription;
		this.currentStock = currentStock;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.categoryId = categoryId;
		this.liked = liked;
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

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public boolean isLiked() {
		return liked;
	}

	public void setLiked(boolean liked) {
		this.liked = liked;
	}

	@Override
	public String toString() {
		return "ReqProductDto [productName=" + productName + ", prductDiscription=" + prductDiscription
				+ ", currentStock=" + currentStock + ", quantity=" + quantity + ", unitPrice=" + unitPrice
				+ ", categoryId=" + categoryId + ", liked=" + liked + "]";
	}

}
