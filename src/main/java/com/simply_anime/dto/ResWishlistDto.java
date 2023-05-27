package com.simply_anime.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.simply_anime.enums.StatusEnum;

@Component
public class ResWishlistDto {
	
	private long id;
	private List<ResProductDto> products;
	private String customerName;
	private String customerEmail;
	private String customerContact;
	private String customerAddress;
	private StatusEnum productStatus;
	
	public ResWishlistDto() {
		
	}

	public ResWishlistDto(long id, List<ResProductDto> products, String customerName, String customerEmail,
			String customerContact, String customerAddress, StatusEnum productStatus) {
		super();
		this.id = id;
		this.products = products;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
		this.productStatus = productStatus;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<ResProductDto> getProducts() {
		return products;
	}

	public void setProducts(List<ResProductDto> products) {
		this.products = products;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public StatusEnum getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(StatusEnum productStatus) {
		this.productStatus = productStatus;
	}

	@Override
	public String toString() {
		return "ResWishlistDto [id=" + id + ", products=" + products + ", customerName=" + customerName
				+ ", customerEmail=" + customerEmail + ", customerContact=" + customerContact + ", customerAddress="
				+ customerAddress + ", productStatus=" + productStatus + "]";
	}
	
}
