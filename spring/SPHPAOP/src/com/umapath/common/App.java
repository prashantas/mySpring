package com.umapath.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.umapath.product.bo.ProductBo;
import com.umapath.product.model.Product;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
	
    	Product product = new Product();
    	product.setProductCode("ABC");
    	product.setProductDesc("This is product ABC");
    	
    	ProductBo productBo = (ProductBo)appContext.getBean("productBoProxy");
    	productBo.save(product, 100);
    	
    	
    }
}
