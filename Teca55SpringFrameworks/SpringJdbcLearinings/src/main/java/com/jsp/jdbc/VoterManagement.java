package com.jsp.jdbc;

import java.util.Arrays;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.jdbc.configuration.VoterConfig;
import com.jsp.jdbc.service.IVoterService;

public class VoterManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(VoterConfig.class);
		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
		IVoterService service = applicationContext.getBean("voterService", IVoterService.class);
		while (true) {
			System.out.println("*******  Enter 1: To Register *******  ");
			System.out.println("*******  Enter 2: Update       ******* ");
			System.out.println("*******  Enter 3: Delete       ******* ");
			System.out.println("*******  Enter 4: Select Operation ******");
			System.out.print("Enter Your Choice :=>  ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				service.register();
			}
				break;
			case 2: {
				while (true) {
					System.out.println("*******************************************************");
					System.out.println("Press-1 to : Update Name By Id ");
					System.out.println("Press-2 to : Update Age by Name and Id");
					System.out.println("Press-3 to : Update Gender By Id");
					System.out.println("Press-4 to : Update Mobile Number By Id And Name");
					System.out.println("Press-5 to : Update Address by Id and Mobile Number");
					System.out.println("*******************************************************");
					System.out.print("Choose Your choice : ");
					int updateChoice = sc.nextInt();
					switch (updateChoice) {
					case 1: {
						service.changeVoterNameById();
						break;
					}
					case 2: {
						service.changeVoterAgeByNameAndId();
						break;
					}
					case 3: {
						service.changeVoterGenderById();
						break;
					}
					case 4: {
						service.changeVoterMobileByIdAndName();
						break;
					}
					case 5: {
						service.changeVoterAddressByIdAndMobile();
						break;
					}
					default: {
						System.out.println("*****...Invalid Input...*******");
					}
					}
					System.out.println(
							"***-- Do You Want To Continue (Or) Do You Want To Exit--*** \n Enter Yes-To Continue (or) No-Exit ");
					System.out.print("Choose Your Choice :");
					String option = sc.next();
					if (option.equalsIgnoreCase("yes"))
						continue;
					else if (option.equalsIgnoreCase("No")) {
						System.out.println("Thank You ✔✔👍👍👋👋");
						break;
					} else {
						System.out.print("Sorry....Wait For a while...!!!");
						break;
					}
				}
				break;
			}

			case 3:
				while (true) {
					System.out.println("****************************************************");
					System.out.println("Press 1 to : Delete By Id ");
					System.out.println("Press 2 to : Delete By Mobile And Id ");
					System.out.println("Press 3 to : Delete By Name and Address ");
					System.out.println("****************************************************");
					System.out.print("Choose Your choice : ");
					int deleteChoice = sc.nextInt();
					switch (deleteChoice) {
					case 1: {
						service.removeVoterById();
						break;
					}
					case 2: {
						service.removeVoterByMobileAndId();
						break;
					}
					case 3: {
						service.removeVoterByNameAndAddress();
						break;
					}
					}
					System.out.println(
							"***-- Do You Want To Continue (Or) Do You Want To Exit--*** \n Enter Yes-To Continue (or) No-Exit ");
					System.out.print("Choose Your Choice :");
					String option = sc.next();
					if (option.equalsIgnoreCase("yes"))
						continue;
					else if (option.equalsIgnoreCase("No")) {
						System.out.println("Thank You ✔✔👍👍👋👋");
						break;
					} else {
						System.out.print("Sorry....Wait For a while...!!!");
						break;
					}
				}
				break;
			case 4: {
				while (true) {
					System.out.println("****************************************************");
					System.out.println("Press 1 to : Read Details Of Voter By Id ");
					System.out.println("Press 2 to : Read ALl Details Of Voters ");
					System.out.println("Press 3 to : Read  Details Of Voters By Name ");
					System.out.println("Press 4 to : Read Details of Voters By Mobile Number");
					System.out.println("****************************************************");
					int option = sc.nextInt();
					switch (option) {
					case 1: {
						service.showDetailsOfVoterById();
					}
						break;
					case 2: {
						service.showAllDetailsOFVoters();
					}
						break;
					case 3: {
						service.showDetailsOfVoterByName();

					}
						break;
					case 4:{
						service.showAllTheDetailsOfVoterByMobileNumber();
						
					}
					break;
					}
					System.out.println(
							"***-- Do You Want To Continue (Or) Do You Want To Exit--*** \n Enter Yes-To Continue (or) No-Exit ");
					System.out.print("Choose Your Choice :");
					String option1 = sc.next();
					if (option1.equalsIgnoreCase("yes"))
						continue;
					else if (option1.equalsIgnoreCase("No")) {
						System.out.println("Thank You ✔✔👍👍👋👋");
						break;
					} else {
						System.out.print("Sorry....Wait For a while...!!!");
						break;
					}
				}

			}

			}
			System.out.println(".....Enter Yes to Continue (or) No to Exit.....   :-");
			String option = sc.next();
			if (option.equalsIgnoreCase("yes"))
				continue;
			else if (option.equalsIgnoreCase("no")) {
				System.out.println("Thank You....!!!!");
				break;
			} else
				System.out.println("Sorry wait for a while👋👋👋👋👋👋👋👋");
		}
	}
}
