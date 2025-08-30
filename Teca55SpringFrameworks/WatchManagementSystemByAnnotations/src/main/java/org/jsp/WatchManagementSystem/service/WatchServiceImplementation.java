package org.jsp.WatchManagementSystem.service;

import java.util.List;

import java.util.ListIterator;
import java.util.Scanner;

import org.jsp.WatchManagementSystem.dao.WatchDao;
import org.jsp.WatchManagementSystem.entity.Watch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WatchServiceImplementation implements WatchService {
	@Autowired
	WatchDao watchDao;
	Scanner sc = new Scanner(System.in);

	public void addWatch() throws Exception {
		Watch watch = new Watch();
		System.out.print("%%% Enter the WATCH BRAND %%% :");
		watch.setWatchBrand(sc.next());
		System.out.print("%%% Enter the WATCH TYPE %%% :");
		watch.setWatchType(sc.next());
		System.out.print("%%% Enter the WATCH PRICE %%% :");
		watch.setWatchPrice(sc.nextDouble());
		System.out.print("%%% Enter the WATCH COLOR %%% :");
		watch.setWatchColor(sc.next());
		System.out.print("%%% Enter the WATCH MODEL %%% :");
		watch.setWatchmodel(sc.next());
		watchDao.insertWatch(watch);

	}

	public void getWatches() throws Exception {
		List<Watch> ls = watchDao.displayWatches();
		if (ls != null) {
			ListIterator<Watch> it = ls.listIterator();
			while (it.hasNext()) {
				Watch watch = it.next();
				System.out.println("---++++++++++++++++++++++++++++++++++----");
				System.out.println("          $$$ WATCH DETAILS $$$");
				System.out.println("---++++++++++++++++++++++++++++++++++----");
				System.out.println("WATCH BRAND : " + watch.getWatchBrand());
				System.out.println("WATCH TYPE : " + watch.getWatchType());
				System.out.println("WATCH PRICE : " + watch.getWatchPrice());
				System.out.println("WATCH COLOR : " + watch.getWatchColor());
				System.out.println("WATCH MODEL : " + watch.getWatchmodel());
				System.out.println("---++++++++++++++++++++++++++++++++++----");
			}
		}
	}

	public void deleteWatchesByBrand() throws Exception {
		System.out.print("Enter Brand Name : ");
		String brand = sc.next();
		if (isPresent(brand)) {
			watchDao.deleteWatchByBrand(brand);
		} else {
			System.out.println("=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("👍👍👍 NO WATCHES FOUND ✌️✌️✌️");
		}

	}

	public boolean isPresent(String brand) throws Exception {
		List<Watch> watches = watchDao.displayWatches();
		if (!watches.isEmpty()) {
			for (Watch watch : watches) {
				if (watch.getWatchBrand().equalsIgnoreCase(brand)) {
					return true;
				}
			}
		}
		return false;

	}

	public void updateoldBrandByNewBrand() throws Exception {
		System.out.print("Enter Old Brand Name : ");
		String oldBrand = sc.next();
		if (isPresent(oldBrand)) {
			System.out.print("Enter The New Brand : ");
			String newBrand = sc.next();
			watchDao.updateOldByNewBrand(oldBrand, newBrand);

		} else {
			System.out.println("=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("👍👍👍 NO WATCHES Brand FOUND ✌️✌️✌️");
		}

	}

}
