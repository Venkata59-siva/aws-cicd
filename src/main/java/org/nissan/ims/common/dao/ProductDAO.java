package org.nissan.ims.common.dao;

import java.util.ArrayList;
import java.util.List;

import org.nissan.ims.common.entity.ProductEntity;
import org.nissan.ims.common.model.Product;
import org.nissan.ims.common.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {

	@Autowired
	ProductRepository productRepository;

	public List<Product> getAllProducts() {
		List<ProductEntity> productEntities = productRepository.findAll();

		List<Product> products = new ArrayList<>();

		for (ProductEntity productEntity : productEntities) {

			Product product = new Product();

			product.setProductId(productEntity.getProductId());
			product.setProductName(productEntity.getProductName());
			product.setProductCategory(productEntity.getProductCategory());
			product.setProductDescription(productEntity.getProductDescription());
			product.setProductPrice(productEntity.getProductPrice());
			product.setProductImage(productEntity.getProductImage());
			products.add(product);
		}

		return products;
	}

	public List<Product> findProductById(int productId) {
		ProductEntity productEntity = productRepository.findById(productId).get();

		List<Product> products = new ArrayList<>();

		Product product = new Product();

		product.setProductId(productEntity.getProductId());
		product.setProductName(productEntity.getProductName());
		product.setProductCategory(productEntity.getProductCategory());
		product.setProductDescription(productEntity.getProductDescription());
		product.setProductPrice(productEntity.getProductPrice());
		product.setProductImage(productEntity.getProductImage());
		products.add(product);

		return products;
	}

	public boolean deleteProductById(int productId) {

		productRepository.deleteById(productId);

		return true;
	}
}
