package com.simply_anime.dto;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ResWarehouseDto {
	
	private long id;
	private List<ResProductDto> products;
	private long qunatity;
	
	public ResWarehouseDto() {
		
	}

	public ResWarehouseDto(long id, List<ResProductDto> products, long qunatity) {
		super();
		this.id = id;
		this.products = products;
		this.qunatity = qunatity;
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

	public long getQunatity() {
		return qunatity;
	}

	public void setQunatity(long qunatity) {
		this.qunatity = qunatity;
	}

	@Override
	public String toString() {
		return "ResWarehouseDto [id=" + id + ", products=" + products + ", qunatity=" + qunatity + "]";
	}
	
}
