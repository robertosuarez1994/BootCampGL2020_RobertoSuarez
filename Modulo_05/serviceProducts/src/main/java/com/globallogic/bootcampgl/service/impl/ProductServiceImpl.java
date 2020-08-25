package com.globallogic.bootcampgl.service.impl;

import com.globallogic.bootcampgl.dto.ProductDTO;
import com.globallogic.bootcampgl.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Product Service Implementation
 */
@Service
public class ProductServiceImpl implements ProductService {

    private static Map<String, ProductDTO> productRepo = new HashMap<>();
    static {
        ProductDTO honey = new ProductDTO();
        honey.setId("1");
        honey.setName("Honey");
        productRepo.put(honey.getId(), honey);

        ProductDTO almond = new ProductDTO();
        almond.setId("2");
        almond.setName("Almond");
        productRepo.put(almond.getId(), almond);
    }
	@Override
	public Collection<ProductDTO> getProducts() {
		return productRepo.values();
	}
	@Override
	public void createProduct(ProductDTO productDTO) {
		productRepo.put(productDTO.getId(), productDTO);
	}
	@Override
	public void updateProduct(String id, ProductDTO product) {
		product.setId(id);
		if(productRepo.remove(id) != null) {
			productRepo.put(product.getId(),product);
		}
	}
	@Override
	public void deleteProduct(String id) {
		productRepo.remove(id);
	}

}
