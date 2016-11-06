package com.niit.dao;

import java.util.List;

import com.niit.model.Product;

public interface ProductDAO {
	
	public void addProduct(Product product);
	public List<Product> getProduct();
	public Product getProductById(String productid);
	public void updateProduct(Product product);
	public void deleteProduct(String productid);

}
