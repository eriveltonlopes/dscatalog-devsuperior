package com.devsuperior.dscatalog.category.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dscatalog.category.Repositories.CategoryRepository;
import com.devsuperior.dscatalog.category.entities.Category;
import com.devsuperior.dscatalog.category.model.ModelCategory;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<ModelCategory> findAll(){
		List<Category> list = repository.findAll();
		
		List<ModelCategory> listModel = list.stream()
				.map(x -> new ModelCategory(x)).collect(Collectors.toList());
		
		return listModel;
	}
}
