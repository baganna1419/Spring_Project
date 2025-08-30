package org.jsp.annotation;

import java.util.Scanner;

import org.jsp.annotation.service.WatchService;
import org.jsp.annotation.service.WatchServiceImplementation;

public class WatchManagementSystem {

	public static void main(String[] args) throws InterruptedException {
		WatchService watchService = new WatchServiceImplementation();
		Scanner sc = new Scanner(System.in);
		System.out.println("⏲⏲⏲⏲⏲⏰⏰⏰⏰⏰⏰⏰⏰⏲⏲⏲⏲⏲⏲⏲⏲");
		System.out.println("⏲⏲⏲⏲⏲⏰⏰⏰⏰⏰⏰⏰⏰⏲⏲⏲⏲⏲⏲⏲⏲");
		String welcome = "🌷🌷🌷🌷🌷🌷🌷 WELCOME TO WATCH SHOP🌷🌷🌷🌷🌷🌷🌷";
		for (int i = 0; i < welcome.length(); i++) {
			System.out.print(welcome.charAt(i));
			Thread.sleep(100);
		}
		System.out.println();
		System.out.println("⏲⏲⏲⏲⏲⏰⏰⏰⏰⏰⏰⏰⏰⏲⏲⏲⏲⏲⏲⏲⏲");
		System.out.println("⏲⏲⏲⏲⏲⏰⏰⏰⏰⏰⏰⏰⏰⏲⏲⏲⏲⏲⏲⏲⏲");
		while (true) {
			System.out.print(
					"Enter 1:👉For To add Watch :\nEnter 2:👉 To dispaly the watch details :\nEnter 3👉Update Name by Watch Brand :"
							+ "\nEnter 4👉Delete Watch By It's Brand Name :"
							+ "\nEnter 5👉Print Watch Price based on Watch Brand : "
							+ "\nEnter 6👉To Update Model Name Based On Brand Name and Brand Type : "
							+ "\nEnter 7👉Search Watch By Brand : "
							+ "\n***********Enter Your Choice Among all of these************* : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				watchService.addWatch();
				break;
			case 2:
				watchService.diplayWatchDetails();
				break;
			case 3:
				watchService.updateTypeOfWatchByItsBrand();
				break;
			case 4:
				watchService.deleteWatchByItsBrand();
				break;
			case 5:
				watchService.printWatchPriceBasedOnBrand();
				break;
			case 6:
				watchService.updateWatchModelByBrandNameAndTypeOfWatch();
				break;
			case 7:
				watchService.searchWatchByBrand();
				break;
			}
			System.out.println("!...Do You Want To Continue...!!!");
			System.out.println("Enter Either 'Yes'(or)'NO' ");
			String confirmation = sc.next();
			if (confirmation.equalsIgnoreCase("yes")) {
				continue;
			} else if (confirmation.equalsIgnoreCase("no")) {
				System.out.println("Thank you😎😎😎😎");
				break;
			} else {
				System.out.println("Get Lost🤞🤞🤞🤞");
				break;
			}
		}

	}
}
