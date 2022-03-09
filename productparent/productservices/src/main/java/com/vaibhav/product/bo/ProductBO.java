package com.vaibhav.product.bo;

import com.vaibhav.product.dto.Product;

public interface ProductBO {

	void create(Product product);
	
	Product findProduct(int id);
}
