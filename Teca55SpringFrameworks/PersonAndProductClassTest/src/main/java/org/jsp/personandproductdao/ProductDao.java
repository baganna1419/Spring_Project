package org.jsp.personandproductdao;

import java.util.List;

import org.jsp.personandproduct.entity.Product;

public interface ProductDao {
	void insertProduct(Product product) throws Exception;
	List<Product> takeOldProducts() throws Exception;
	List<Product> displayProducts() throws Exception;
	Product checkProduct(String productname) throws Exception;
	

}
