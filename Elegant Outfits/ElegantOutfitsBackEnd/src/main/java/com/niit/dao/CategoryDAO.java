package com.niit.dao;

import java.util.List;

import com.niit.model.Category;



public interface CategoryDAO {
	
	public void insertCategory(Category category);
	public List<Category> getCategory();
	public Category getCategoryById(String categoryid);
	public void updateCategory(Category category);
	public void deleteCategory(String categoryid);
	public List<Category> getCategoryList();

}
