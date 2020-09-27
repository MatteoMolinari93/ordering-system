package com.molinari.orderingsystem.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.molinari.orderingsystem.accessingdatajpa.Product;
import com.molinari.orderingsystem.accessingdatajpa.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepo;

	@Override
	public Product createProduct(Product product) {
		productRepo.save(product);
		Product fetchedProduct = productRepo.findById(product.getId()).orElseThrow();
		return fetchedProduct;
	}

	@Override
	public Product updateProduct(String id, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Long id) {
		productRepo.deleteById(id);
	}

	@Override
	public Collection<Product> getProducts() {
		return productRepo.findAll();
	}

	@Override
	public Product getProduct(Long id) {
		return productRepo.findById(id).orElseThrow();
	}

	@Override
	public Product stockProduct(Long id) {
		Product product = productRepo.findById(id).orElseThrow();
		product.stock();
		return productRepo.save(product);
	}

}
