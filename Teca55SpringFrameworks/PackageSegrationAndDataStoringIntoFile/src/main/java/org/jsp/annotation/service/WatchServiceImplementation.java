package org.jsp.annotation.service;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import org.jsp.annotation.dao.WatchDao;
import org.jsp.annotation.dao.WatchDaoImplementation;
import org.jsp.annotation.entity.Watch;

public class WatchServiceImplementation implements WatchService {

	Scanner sc = new Scanner(System.in);
	WatchDao watchDao = new WatchDaoImplementation();

	public void addWatch() throws Exception {
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

	public void diplayWatchDetails() throws Exception {
		List<Watch> watchList = watchDao.displayWatch();
		if (watchList != null) {
			ListIterator<Watch> it = watchList.listIterator();
			while (it.hasNext()) {
				Watch watch = it.next();
				System.out.println("---++++++++++++++++++++++++++++++++++----");
				System.out.println("          $$$ WATCH DETAILS $$$");
				System.out.println("---++++++++++++++++++++++++++++++++++----");
				System.out.println("WATCH BRAND : " + watch.getWatchBrand());
				System.out.println("WATCH TYPE : " + watch.getWatchType());
				System.out.println("WATCH PRICE : " + watch.getWatchPrice());
				System.out.println("WATCH COLOR : " + watch.getWatchColor());
				System.out.println("WATCH MODEL : " + watch.getWatchModel());
				System.out.println("---++++++++++++++++++++++++++++++++++----");
			}
		}
	}

}
