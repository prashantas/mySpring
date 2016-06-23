package com.umapath.product.bo;

import com.umapath.product.model.Product;

public interface ProductBo {
	
	void save(Product product, int qoh);
	
}
