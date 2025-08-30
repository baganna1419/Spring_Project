package org.jsp.annotation.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import org.jsp.annotation.entity.Watch;

public class WatchDaoImplementation implements WatchDao {

	List<Watch> database = new ArrayList<Watch>();

	public void insertWatch(Watch watch) {
		database.add(watch);
		System.out.println("👍👍👍 Watch Added Successfully 👍👍👍");
	}

	public void displayWatch() {
		for (Watch watch : database) {
			System.out.println(watch);
		}
	}

	public void updateWatchTypeByBrand(String brandName, String type) {
		ListIterator<Watch> watchListIterator = database.listIterator();
		while (watchListIterator.hasNext()) {
			Watch watch = watchListIterator.next();
			if (watch.getWatchBrand().equalsIgnoreCase(brandName)) {
				watch.setWatchType(type);
				System.out.println("!!!!!!.....Watch Type Updated Succesfully.....!!!!!");
			}
		}
	}

	public void deleteWatchByBrandName(String brandName) {
		ListIterator<Watch> watchListIterator = database.listIterator();
		while (watchListIterator.hasNext()) {
			Watch watch = watchListIterator.next();
			if (watch.getWatchBrand().equalsIgnoreCase(brandName)) {
				watchListIterator.remove();
				System.out.println("!!!!!...Watch Deleted Successfully...!!!!!");
			}
		}
	}

	public void printPriceBasedOnWatchBrand(String brandName) {
		for (Watch watch : database) {
			if (watch.getWatchBrand().equalsIgnoreCase(brandName)) {
				System.out.println("********************************************************");
				System.out.println("Price Details Of " + brandName + "Watch is : " + watch.getWatchPrice());
				System.out.println("********************************************************");
			}

		}

	}

	public void updateWatchModelBasedOnBrandAndTypeOfWatch(String brandName, String type) {
		ListIterator<Watch> watchListIterator = database.listIterator();
		Scanner sc = new Scanner(System.in);
		while (watchListIterator.hasNext()) {
			Watch watch = watchListIterator.next();
			if (watch.getWatchBrand().equalsIgnoreCase(brandName) && watch.getWatchType().equalsIgnoreCase(type)) {
				System.out.print("Enter new  watch model :  ");
				String newWatchModel = sc.next();
				watch.setWatchModel(newWatchModel);
				System.out.println("New Watch Model Updated Successfully..!!!!!");
			} else {
				System.out.println("Invalid Brand Name Or Brand Type..");
			}
		}
	}

	public void searchTypeOfWatchByBrand(String brandName) {
		if (!database.isEmpty()) {
			for (Watch watch : database) {
				if (watch.getWatchBrand().equalsIgnoreCase(brandName)) {
					System.out.println("*******************************************");
					System.out.println("Watch Found.......");
					System.out.println("Type Of Watch is :" + watch.getWatchType());
					System.out.println("*******************************************");
				} else {
					System.out.println("Enter valid brandName for watch");
				}
			}
		} else {
			System.out.println("No Watches Are Available....!!");
		}
	}

}
