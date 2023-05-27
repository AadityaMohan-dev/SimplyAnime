package com.simply_anime.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simply_anime.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
