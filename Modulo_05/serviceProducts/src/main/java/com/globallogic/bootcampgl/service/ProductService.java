package com.globallogic.bootcampgl.service;

import java.util.Collection;

import com.globallogic.bootcampgl.dto.ProductDTO;

/**
 * Product Service
 */

public interface ProductService {
	
	public abstract Collection<ProductDTO> getProducts();
	public abstract void createProduct(ProductDTO productDTO);
	public abstract void updateProduct(String id,ProductDTO product);
	public abstract void deleteProduct(String id);
}
