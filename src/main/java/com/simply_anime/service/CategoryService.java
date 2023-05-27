package com.simply_anime.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.simply_anime.model.Category;
import com.simply_anime.repository.CategoryRepository;

public class CategoryService {

	@Autowired
	private CategoryRepository cr;
	
	//add Category
	public ResponseEntity<Object> addCategory(Category cat) {
		// TODO Auto-generated method stub
		Category category = new Category();
		category.setCategoryName(cat.getCategoryName());
		cr.save(category);
		return ResponseEntity.status(HttpStatus.OK).body("Category Added Sucessfully.");
	}
	
	// get all Category
	public List<Category> getAllCategory(){
		List<Category> list = cr.findAll();
		return list;
	}
	
	//find by id
	public ResponseEntity<Object> getCategoryById(long id) {
		Optional<Category> cur = cr.findById(id);
		if(cur.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Category Not Found Check your Id.");
		}
		Category category = cur.get();
		return ResponseEntity.status(HttpStatus.OK).body(category);
		
	}

}
