package org.jsp.personandproduct;

import java.util.Iterator;
import java.util.Scanner;

import org.jsp.personandproduct.sevice.PersonService;
import org.jsp.personandproduct.sevice.PersonServiceImplementation;
import org.jsp.personandproduct.sevice.ProductService;
import org.jsp.personandproduct.sevice.ProductServiceImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class PersonMainClass {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);;
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("PersonConfig.xml");
//		PersonService personService = applicationContext.getBean("personService",PersonServiceImplementation.class);
//		ProductService productService = applicationContext.getBean("productService",ProductServiceImplementation.class);
		ProductService productService=new ProductServiceImplementation();
		PersonService personService=new PersonServiceImplementation();
		System.out.println("***********************************************");
		System.out.println("***********************************************");
		System.out.println("***********************************************");
		String welcome = " 🌷🌷🌷🌷🌷🌷🌷 ✌ WEL-COME ✌ 🌷🌷🌷🌷🌷🌷";
		for (int i = 0; i < welcome.length(); i++) {
				System.out.print(welcome.charAt(i));
//				Thread.sleep(150);
			
		}
		System.out.println();
		System.out.println("***********************************************");
		System.out.println("***********************************************");
		System.out.println("***********************************************");

		while (true) {
			System.out.print(
					"***************************************\nEnter 1:For Adding Product \nEnter 2 :For Adding Persons \nEnter 3:For Update Email By Name \nEnter 4: Display \nEnter 5:For Delete Person By name \n************************************** \n");
			System.out.print("👉👉👉👉👉👉👉👉Enter Your Choice :");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:productService.addProduct();break;
			case 2:personService.addPerson();break;
			case 3:personService.changeEmailByName();break;
			case 4:personService.getPersonDetails();break;
			case 5:personService.deletePersonByName();break;
			}
			System.out.print("------Enter Yes To Continue (or) Enter No To Exit------- : ");
			String confirmation=sc.next();
			if(confirmation.equalsIgnoreCase("yes")) continue;
			else if(confirmation.equalsIgnoreCase("no")) {
				System.out.println("✔✔✔✔😎😎😎😎 Thank You ✔✔✔✔😎😎😎😎 ");
				break;
			}else {
				System.out.println("Bad Luck 🤞🤞🤞🤞🤞🤞");break;
			}
		
			
			
		}
	}
}
