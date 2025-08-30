package org.jsp.personandproduct.sevice;

import java.util.Scanner;

import org.jsp.personandproduct.entity.Product;
import org.jsp.personandproductdao.ProductDao;
import org.jsp.personandproductdao.ProductDaoImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class ProductServiceImplementation implements ProductService {
  
    ProductDao productDao=new  ProductDaoImplementation();
    static Scanner sc=new Scanner(System.in);
	public void addProduct() throws Exception {
		Product product=new Product();
		System.out.print("Enter  Product Id ");
		product.setProductId(sc.nextInt());
		System.out.print("Enter  Product Name ");
		product.setProductName(sc.next());
		System.out.print("Enter  Product Brand ");
		product.setProductBrand(sc.next());
		System.out.print("Enter  Product Price ");
		product.setProductPrice(sc.nextDouble());	
		productDao.insertProduct(product);

	}

}
