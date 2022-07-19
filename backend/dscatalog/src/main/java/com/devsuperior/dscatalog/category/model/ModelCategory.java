package com.devsuperior.dscatalog.category.model;

import java.io.Serializable;

import com.devsuperior.dscatalog.category.entities.Category;

public class ModelCategory implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public ModelCategory() {}

	public ModelCategory(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	public ModelCategory(Category category) {
		id = category.getId();
		name = category.getName();
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
