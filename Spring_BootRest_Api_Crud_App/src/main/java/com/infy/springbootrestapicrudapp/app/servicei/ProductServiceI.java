package com.infy.springbootrestapicrudapp.app.servicei;

import java.util.List;

import com.infy.springbootrestapicrudapp.app.model.Product;

public interface ProductServiceI {

	Product saveProduct(Product p);

	List<Product> getProducts();

	Product updateProduct(Product p);

	void deleteProduct(Integer productId);

}
