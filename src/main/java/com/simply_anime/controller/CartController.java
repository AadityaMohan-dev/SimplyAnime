package com.simply_anime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.simply_anime.model.Product;
import com.simply_anime.service.CartService;

@RestController
@RequestMapping("api/cart")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@PostMapping("/add")
	public ResponseEntity<Object> addToCart(@RequestBody Product product) {
		return cartService.addToCart(product);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Object> deleteCart(){
		return cartService.deleteCart();
	}

//	@PutMapping("/update/{productId}/{quantity}")
//	public ResponseEntity<Object> updateCart(@PathVariable("productId")int productId,@PathVariable("quantity") int quantity,@RequestBody Cart cart){
//		return cartService.updateCartDetails(productId,quantity, cart);
//	}
}
