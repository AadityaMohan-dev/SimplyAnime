package com.simply_anime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simply_anime.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
