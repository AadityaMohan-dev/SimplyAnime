package com.simply_anime.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.simply_anime.model.Cart;
import com.simply_anime.model.Product;
import com.simply_anime.repository.CartRepository;
import com.simply_anime.repository.ProductRepository;

@Service
public class CartService {

	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	//This method is used for Empty the cart
	public ResponseEntity<Object> deleteCart() {
		cartRepository.deleteAll();
		return ResponseEntity.status(HttpStatus.OK).body("Cart deleted successfully");
	}
	
	//This method is used for add Product to cart
	public ResponseEntity<Object> addToCart(Product product) {
		// TODO Auto-generated method stub
		//Cart cartDB = new Cart();
		Cart cart = null;
		Optional<Cart> optional = cartRepository.findByProductContaining(product);
		if(optional.isPresent()) {
			System.out.println(optional.get());
			cart = optional.get();
		}
		Optional<Product> existingCartItem = cart.getProduct() //problem it take cart null while checking use try and catch.
					 							 .stream()
					 							 .filter(p -> p.getId() == product.getId())
					 							 .findFirst();
		
		if(existingCartItem.isPresent()) {
			System.out.println(existingCartItem.get());
			Product existingProduct = existingCartItem.get();
			existingProduct.setQuantity(existingProduct.getQuantity() + product.getQuantity());
			productRepository.save(existingProduct);
		} else {
			cart.getProduct().add(product);
		}
		cart.computeCartTotals();
		
		cartRepository.save(cart);
		return ResponseEntity.status(HttpStatus.OK).body("Product added in cart successfully");
	}
	
	//This method is used for update cart details like cart Quantity and Price .
//	public ResponseEntity<Object> updateCartDetails(int productId,int quantity,Cart cart) {
//		// TODO Auto-generated method stub
//		
//		
//		
//		return null;
//	}

}