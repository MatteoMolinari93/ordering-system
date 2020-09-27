package com.molinari.orderingsystem.services;

import java.util.Collection;

import com.molinari.orderingsystem.accessingdatajpa.Product;

public interface ProductService {
	public abstract Product createProduct(Product product);
	public abstract Product updateProduct(String id, Product product);
	public abstract void deleteProduct(Long id);
	public abstract Collection<Product> getProducts();
	public abstract Product getProduct(Long id);
	public abstract Product stockProduct(Long id);
}
