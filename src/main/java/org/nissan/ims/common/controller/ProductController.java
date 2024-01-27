package org.nissan.ims.common.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.nissan.ims.common.model.Product;
import org.nissan.ims.common.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"})
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	public List<Product> findAllProducts(HttpServletResponse response) throws InterruptedException {
		//Thread.sleep(4000);
		//response.setStatus(402);
		
		//return null;
		return productService.getAllProducts();
	}
	
	@GetMapping("/product/{productId}")
	public List<Product> findProductById(@PathVariable int productId ) {
		return productService.findProductById(productId);
	}
	
	@DeleteMapping("/product/{productId}")
	public boolean deleteProductById(@PathVariable int productId) {
		return productService.deleteProductById(productId);
	}
}
