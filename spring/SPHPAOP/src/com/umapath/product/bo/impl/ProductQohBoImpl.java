package com.umapath.product.bo.impl;

import com.umapath.product.bo.ProductQohBo;
import com.umapath.product.dao.ProductQohDao;
import com.umapath.product.model.ProductQoh;

public class ProductQohBoImpl implements ProductQohBo{
	
	ProductQohDao productQohDao;
	
	public void setProductQohDao(ProductQohDao productQohDao) {
		this.productQohDao = productQohDao;
	}

	public void save(ProductQoh productQoh){
		productQohDao.save(productQoh);
	}

}
