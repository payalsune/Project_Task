package com.infy.springbootrestapicrudapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootrestapicrudapp.app.model.Product;
import com.infy.springbootrestapicrudapp.app.servicei.ProductServiceI;

@CrossOrigin("*")
@RestController
@RequestMapping(value="/api")
public class ProductController {

	@Autowired
	ProductServiceI psi;
	
	@PostMapping(value="/product",consumes = {"application/json","application/xml"})
	public ResponseEntity<Product> saveProduct(@RequestBody Product p)
	{
		Product product=psi.saveProduct(p);
		return new ResponseEntity<Product>(product,HttpStatus.CREATED);
	}
	
	@GetMapping(value="/products",produces = {"application/json"})
	public ResponseEntity<List<Product>> getProducts()
	{
//		try {
//			
//			int a=10/0;
//			
//		} catch (Exception e) {
//			return new ResponseEntity<List<Product>>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
		
		List<Product>list=psi.getProducts();
		return new ResponseEntity<List<Product>>(list,HttpStatus.OK);
	}
	
	@PutMapping(value = "/product/{productId}")
	public ResponseEntity<Product> updateProduct(@PathVariable Integer productId,@RequestBody Product p)
	{
		p.setProductId(productId);
		Product product=psi.updateProduct(p);
		return new ResponseEntity<Product>(product,HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/product/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable Integer productId)
	{
		psi.deleteProduct(productId);
		String s="Product deleted successfully";
		return new ResponseEntity<String>(s,HttpStatus.NO_CONTENT);
	}
}
