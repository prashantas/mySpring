package com.umapath.product.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.umapath.product.dao.ProductDao;
import com.umapath.product.dao.ProductQohDao;
import com.umapath.product.model.Product;
import com.umapath.product.model.ProductQoh;

public class ProductQohDaoImpl extends HibernateDaoSupport implements ProductQohDao{
	
	public void save(ProductQoh productQoh){
		getHibernateTemplate().save(productQoh);
	}
	
}