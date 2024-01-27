package org.nissan.ims.common.service;

import java.util.List;

import org.nissan.ims.common.dao.ProductDAO;
import org.nissan.ims.common.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	ProductDAO productDAO;

	public List<Product> getAllProducts() {
		return productDAO.getAllProducts();
	}
	
	public List<Product> findProductById(int productId) {
		return productDAO.findProductById(productId);
	}
	
	public boolean deleteProductById(int productId) {
		return productDAO.deleteProductById(productId);
	}
}
