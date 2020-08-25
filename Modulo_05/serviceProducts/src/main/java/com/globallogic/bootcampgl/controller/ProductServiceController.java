package com.globallogic.bootcampgl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.bootcampgl.dto.ProductDTO;
import com.globallogic.bootcampgl.service.ProductService;
import com.globallogic.bootcampgl.service.impl.ProductServiceImpl;

/**
 * Product Service Controller
 */
@RestController
public class ProductServiceController {

	@Autowired
	ProductService productService; 
	
	@GetMapping (value = "/products")
	public ResponseEntity<Object> getProducts(){
		return new ResponseEntity<>(productService.getProducts(),HttpStatus.OK);
	}
	
	@PostMapping (value = "/products")
	public ResponseEntity<Object> createProducts(@RequestBody ProductDTO product){
		productService.createProduct(product);
		return new ResponseEntity<>("creadooo",HttpStatus.CREATED);
	}
	
	@PutMapping (value = "/products/{id}")
	public ResponseEntity<Object> createProducts(
			@PathVariable("id")String id,
			@RequestBody ProductDTO product){
		productService.updateProduct(id,product);
		return new ResponseEntity<>("updateado geni@",HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "/products/{id}")
	public ResponseEntity<Object> deleteProduct(
			@PathVariable("id")String id){
		productService.deleteProduct(id);
		return new ResponseEntity<>("delete product",HttpStatus.OK);
	}
}
