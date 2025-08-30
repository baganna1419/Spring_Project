package org.jsp.personandproductdao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsp.personandproduct.entity.Product;
import org.springframework.stereotype.Component;
@Component
public class ProductDaoImplementation implements ProductDao {

	public void insertProduct(Product product) throws Exception {
		List<Product> productList;
		try {
			productList = takeOldProducts();
		} catch (EOFException e) {
			productList = new ArrayList<Product>();
		}
		productList.add(product);
		File file = new File("D://Product.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(productList);
		objectOutputStream.flush();
		objectOutputStream.close();
		System.out.println("!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!");
		System.out.println("👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍");
		System.out.println("✔✔✔✔ Product Added Successfully ✔✔✔✔");
		System.out.println("👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍");
		System.out.println("!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!");

	}

	public List<Product> takeOldProducts() throws Exception {
		File file = new File("D://Product.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		return (List<Product>) objectInputStream.readObject();
	}

	public List<Product> displayProducts() throws Exception {
		List<Product> products=new ArrayList<Product>();
		File file = new File("D://Product.txt");
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			return (List<Product>) objectInputStream.readObject();
		}catch(EOFException e) {
			System.out.println("No Products Available");
			return null;
		}
		
	}

	public Product checkProduct(String productname) throws Exception {
		List<Product> displayProducts = displayProducts();
		if(displayProducts!=null) {
			for (Product product : displayProducts) {
				if(product.getProductName().equalsIgnoreCase(productname)) {
					return product;
				}
			}
		}
		return null;
	}

}
