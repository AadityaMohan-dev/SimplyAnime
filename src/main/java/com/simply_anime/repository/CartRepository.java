package com.simply_anime.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simply_anime.model.Cart;
import com.simply_anime.model.Product;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{

	Optional<Cart> findByProductContaining(Product product);

}
