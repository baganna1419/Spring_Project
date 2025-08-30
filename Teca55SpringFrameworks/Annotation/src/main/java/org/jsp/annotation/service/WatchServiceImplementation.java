package org.jsp.annotation.service;

import java.util.Scanner;

import org.jsp.annotation.dao.WatchDao;
import org.jsp.annotation.dao.WatchDaoImplementation;
import org.jsp.annotation.entity.Watch;

public class WatchServiceImplementation implements WatchService {

	Scanner sc = new Scanner(System.in);
	WatchDao watchDao = new WatchDaoImplementation();

	public void addWatch() {
		Watch watch = new Watch();
		System.out.print("Enter The Watch Brand : ");
		watch.setWatchBrand(sc.next());
		System.out.print("Enter The Watch Type : ");
		watch.setWatchType(sc.next());
		System.out.print("Enter The Watch Price : ");
		watch.setWatchPrice(sc.nextDouble());
		System.out.print("Enter The Watch Color : ");
		watch.setWatchColor(sc.next());
		System.out.print("Enter The Watch Model : ");
		watch.setWatchModel(sc.next());
		watchDao.insertWatch(watch);
	}

	public void diplayWatchDetails() {
		watchDao.displayWatch();
	}

	public void updateTypeOfWatchByItsBrand() {
		System.out.println("******** Update Name Of Watch By Brand Name *********");
		System.out.print("Enter The Brand Name : ");
		String brandName = sc.next();
		System.out.print("Enter The New Type: ");
		String newWatchType = sc.next();
		watchDao.updateWatchTypeByBrand(brandName, newWatchType);
	}

	public void deleteWatchByItsBrand() {
		System.out.println("********** Delete Watch By Brand Name *********");
		System.out.print("Enter The Brand Name : ");
		String brandName = sc.next();
		System.out.print("Re-enter The Brand Name for Confirmation : ");
		brandName = sc.next();
		watchDao.deleteWatchByBrandName(brandName);
	}

	public void printWatchPriceBasedOnBrand() {
		System.out.println("********** Watch Price Based On Brand Name *********");
		System.out.print("Enter The Brand Name : ");
		String brandName = sc.next();
		watchDao.printPriceBasedOnWatchBrand(brandName);
	}

	public void updateWatchModelByBrandNameAndTypeOfWatch() {
		System.out.println("******* Update Watch Model Based On Watch Brand And Watch Type ********");
		System.out.print("Enter The Brand Name : ");
		String brandName = sc.next();
		System.out.print("Enter The Brand Type : ");
		String brandType = sc.next();
		watchDao.updateWatchModelBasedOnBrandAndTypeOfWatch(brandName, brandType);
	}

	public void searchWatchByBrand() {
		System.out.println("***** Search Watch By Brand *****");
		System.out.print("Enter The Brand Name : ");
		String brandName = sc.next();
		watchDao.searchTypeOfWatchByBrand(brandName);
	}

}
