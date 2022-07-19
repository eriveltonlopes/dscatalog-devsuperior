package com.devsuperior.dscatalog.category.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.category.model.ModelCategory;
import com.devsuperior.dscatalog.category.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<ModelCategory>> findAll(){
		
		List<ModelCategory> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
}
