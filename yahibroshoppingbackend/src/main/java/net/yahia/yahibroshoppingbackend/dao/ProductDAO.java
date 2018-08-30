package net.yahia.yahibroshoppingbackend.dao;

import java.util.List;

import net.yahia.yahibroshoppingbackend.dto.Product;



public interface ProductDAO {
	Product get(int productId);
	List<Product> list();
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	//bussiness methods
	List<Product> listActiveProducts();
	List<Product> listActiveProductsByCategory(int categoryId);
	List<Product> getLatestActiveProducts(int count);
}
