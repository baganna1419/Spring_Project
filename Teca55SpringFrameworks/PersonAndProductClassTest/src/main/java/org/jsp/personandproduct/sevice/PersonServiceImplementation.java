package org.jsp.personandproduct.sevice;

import java.util.List;
import java.util.Scanner;

import org.jsp.personandproduct.entity.Person;
import org.jsp.personandproduct.entity.Product;
import org.jsp.personandproductdao.PersonDao;
import org.jsp.personandproductdao.PersonDaoImplementation;
import org.jsp.personandproductdao.ProductDao;
import org.jsp.personandproductdao.ProductDaoImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class PersonServiceImplementation implements PersonService {

	static Scanner sc = new Scanner(System.in);
	PersonDao personDao =new PersonDaoImplementation();
	ProductDao productDao=new ProductDaoImplementation();

	public void addPerson() throws Exception {
		Person person = new Person();
		System.out.print("Enter Person Name : ");
		person.setPersonName(sc.next());
		System.out.print("Enter Person Age : ");
		person.setPersonAge(sc.nextInt());
		System.out.print("Enter Person Address : ");
		person.setPersonAddress(sc.next());
		System.out.print("Enter Person Email-Id : ");
		person.setPersonEmailId(sc.next());
		List<Product> displayProducts = productDao.displayProducts();
		System.out.println("*****************************************");
		System.out.println("%%%%%%%%%%%% Available Products are %%%%%%%%%%%% ");
		System.out.println("*****************************************");

		if(displayProducts!=null) {
			for (Product product : displayProducts) {
				System.out.println("Product Id    : "+product.getProductId());
				System.out.println("Product Name  : "+product.getProductName());
				System.out.println("Product Brand : "+product.getProductBrand());
				System.out.println("Product Price : "+product.getProductPrice());
				System.out.println("*******************************************");		
			}
			System.out.println("✌✌✌✌✌✌ Choose The Product Among Them ✌✌✌✌✌✌");
			System.out.print("Enter Product Name : ");
			String productName=sc.next();
			Product product = productDao.checkProduct(productName);
			if(product!=null) {
				person.setProduct(product);
				personDao.insertPersonDetails(person);
		}else {
				System.out.println("No Product Found..");
			}
		}
	}

	public void getPersonDetails() throws Exception {

		List<Person> detailsOfPerson = personDao.getDetailsOfPerson();
		if (detailsOfPerson != null) {
			System.out.println("***********************************************");
			for (Person person : detailsOfPerson) {
				System.out.println(person);
			}
		}

	}

	public String findName(String name) throws Exception {

		List<Person> detailsOfPerson = personDao.getDetailsOfPerson();
		if (detailsOfPerson != null) {
			for (Person person : detailsOfPerson) {
				if (person.getPersonName().equalsIgnoreCase(name)) {
					return name;
				}
			}
		}
		return null;

	}

	public void changeEmailByName() throws Exception {
		System.out.print("Enter The Name : ");
		String name = sc.next();
		if (findName(name) != null) {
			System.out.print("Enter Email-Id : ");
			String emailid = sc.next();
			personDao.updateEmailByName(name, emailid);
		} else {
			System.out.println("No Name Found...!!!!!!");
		}

	}

	public void deletePersonByName() throws Exception {
		System.out.print("Enter The Name : ");
		String name = sc.next();
		if(findName(name)!=null) {
			personDao.deletePersonName(name);
			
		}else {
			System.out.println("NO Person Found..");
		}
		
		
	}

}
