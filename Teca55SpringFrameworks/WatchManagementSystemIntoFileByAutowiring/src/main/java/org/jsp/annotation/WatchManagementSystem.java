package org.jsp.annotation;

import java.util.Scanner;

import org.jsp.annotation.service.WatchService;
import org.jsp.annotation.service.WatchServiceImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WatchManagementSystem {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
    	ApplicationContext context = new ClassPathXmlApplicationContext("WatchConfig.xml");
    	WatchService service = context.getBean("service",WatchServiceImplementation.class);
    	
        System.out.println( "\n-*-- 🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸 -*--" );
        System.out.println("-------------------------------------------------------");
        System.out.print("          ");
        String welcome = "💐💐WELCOME TO WATCH SHOP💐💐";
        for(int i=0; i<welcome.length(); i++)
        	{
        		System.out.print(welcome.charAt(i));
        		Thread.sleep(100);
        	}
        System.out.println();
        System.out.println("-------------------------------------------------------\n");
        System.out.println("_______________________________________________________");
        
        while(true)
        {
	        System.out.println("✌️✌️✌️ Press 1 to : ADD WATCH ->>");
	        System.out.println("✌️✌️✌️ Press 2 to : ADD DISPLAY WATCHES ->>");
	        int choice = sc.nextInt();
	        switch(choice)
	        {
	        	case 1 : service.addWatch();break;
	        	case 2 : service.getWatches();break;
	        
	        }
	        System.out.println("\n 🤔🤔🤔 DO YOU WANT TO CONTINUE 🤔🤔🤔");
	        System.out.println("** Say 'YES' (OR) 'NO' **");
	        String choice1 = sc.next();
	        if(choice1.equalsIgnoreCase("yes")) continue;
	        else if(choice1.equalsIgnoreCase("no"))
	        {
	        	System.out.println("\n 🙏🙏🙏THANK YOU VISIT AGAIN🙏🙏🙏");
	        	break;
	        }
	        else
	        {
	        	System.out.println("\n GET LOST👉👉👉");
	        	break;
	        }
        }
	}
}
