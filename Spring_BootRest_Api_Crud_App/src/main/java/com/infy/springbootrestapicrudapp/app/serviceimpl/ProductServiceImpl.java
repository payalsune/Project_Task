package com.infy.springbootrestapicrudapp.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootrestapicrudapp.app.model.Product;
import com.infy.springbootrestapicrudapp.app.repository.ProductRepository;
import com.infy.springbootrestapicrudapp.app.servicei.ProductServiceI;

@Service
public class ProductServiceImpl implements ProductServiceI
{
	@Autowired
	ProductRepository pr;

	@Override
	public Product saveProduct(Product p) {
		
		return pr.save(p);
	}

	@Override
	public List<Product> getProducts() {
		
		return pr.findAll();
	}

	@Override
	public Product updateProduct(Product p) {
		
		return pr.save(p);
	}

	@Override
	public void deleteProduct(Integer productId) {
		pr.deleteById(productId);
		
	}

}
