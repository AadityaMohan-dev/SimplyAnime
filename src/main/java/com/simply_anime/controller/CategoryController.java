package com.simply_anime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simply_anime.model.Category;
import com.simply_anime.service.CategoryService;

@RestController
@RequestMapping("api/category")
public class CategoryController {
	
	@Autowired
	private CategoryService cs;

	@PostMapping("/add")
	public ResponseEntity<Object> addCategory(@RequestBody Category cat){
		return  cs.addCategory(cat);
	}
	
	@GetMapping("/get/all")
	public List<Category> getAllCategory(){
		return cs.getAllCategory();
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Object> getCategoryById(@PathVariable("id")long id){
		return cs.getCategoryById(id);
	}
	
	
}
