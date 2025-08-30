package org.jsp.WatchManagementSystem;


import java.util.Scanner;

import org.jsp.WatchManagementSystem.service.WatchServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class WatchManagementSystem
{
	static Scanner sc=new Scanner(System.in);

    public static void main( String[] args ) throws Exception 
    {
    	
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("WatchConfig.xml");
    	WatchServiceImplementation watchService = applicationContext.getBean("watchServiceImplementation",WatchServiceImplementation.class);
 
    	System.out.println( "\n-*-- 🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸 -*--" );
        System.out.println("-------------------------------------------------------");
        String welcome = "💐💐WELCOME TO WATCH SHOP💐💐";
        for(int i=0; i<welcome.length(); i++)
        	{
        		System.out.print(welcome.charAt(i));
        		try {
					Thread.sleep(150);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        System.out.println();
        System.out.println("-------------------------------------------------------\n");
        System.out.println("_______________________________________________________");
        
        while(true)
        {
	        System.out.println("✌️✌️✌️ Press 1 to : ADD WATCH ->>");
	        System.out.println("✌️✌️✌️ Press 2 to : ADD DISPLAY WATCHES ->>");
	        System.out.println("✌️✌️✌️ Press 3 to : DELETE WATCH BRAND ->>");
	        System.out.println("✌️✌️✌️ Press 4 to : Update OLd Brand With New Brand ->>");
	        System.out.println("✌️✌️✌️ Press 5 to : Update Model By  Brand ->>");
	        int choice = sc.nextInt();
	        switch(choice)
	        {
	        case 1 :watchService.addWatch();;break;
        	case 2 : watchService.getWatches();break;
        	case 3: watchService.deleteWatchesByBrand();;break;
        	case 4: watchService.updateoldBrandByNewBrand();break;
        	case 5:watchService.changeModelByBrand();break;
	        
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
