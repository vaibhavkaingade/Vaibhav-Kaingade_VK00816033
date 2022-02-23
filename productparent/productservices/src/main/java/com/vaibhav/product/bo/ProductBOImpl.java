package com.vaibhav.product.bo;

import com.vaibhav.product.dao.ProductDAO;
import com.vaibhav.product.dao.ProductDAOImpl;
import com.vaibhav.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
