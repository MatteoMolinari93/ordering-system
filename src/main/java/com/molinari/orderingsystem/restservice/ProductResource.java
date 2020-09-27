package com.molinari.orderingsystem.restservice;

import org.springframework.web.bind.annotation.RestController;

import com.molinari.orderingsystem.accessingdatajpa.Product;
import com.molinari.orderingsystem.services.ProductService;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ProductResource {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/products/{id}/stock")
	public Product stockProduct(@PathVariable(value = "id") final Long id) {
		return productService.stockProduct(id);
	}
	
	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable(value = "id") final Long id) {
		return productService.getProduct(id);
	}
	
	@DeleteMapping("/products/{id}")
	public void deleteProduct(@PathVariable(value = "id") final Long id) {
		productService.deleteProduct(id);
	}
	
	@GetMapping("/products")
	public Collection<Product> getProducts() {
		return productService.getProducts();
	}
	
	@PostMapping("/products")
	public Product createProduct(@RequestBody final Product product) {
		return productService.createProduct(product);
	}
}
