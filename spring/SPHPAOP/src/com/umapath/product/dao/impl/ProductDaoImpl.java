package com.umapath.product.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.umapath.product.dao.ProductDao;
import com.umapath.product.model.Product;

public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao{
	
	public void save(Product product){
		getHibernateTemplate().save(product);
	}
	
}