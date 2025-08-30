package org.jsp.WatchManagementSystem.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import org.jsp.WatchManagementSystem.entity.Watch;
import org.springframework.stereotype.Component;

@Component
public class WatchDaoImplementation implements WatchDao {
	public List<Watch> takeOld() throws Exception {
		File f = new File("D://Watch.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		return (List<Watch>) ois.readObject();
	}

	public void insertWatch(Watch watch) throws Exception {
		List<Watch> prs;
		try {
			prs = takeOld();
		} catch (EOFException e) {
			prs = new ArrayList<Watch>();
		}
		prs.add(watch);
		File f = new File("D://Watch.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(prs);
		oos.flush();
		oos.close();
		fos.close();
		System.out.println("=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("👍👍👍 WATCH IS ADDED ✌️✌️✌️");
		System.out.println("=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
	}

	public List<Watch> displayWatches() throws Exception {
		List<Watch> ls = new ArrayList<Watch>();
		try {
			File f = new File("D://Watch.txt");
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			ls = (List<Watch>) ois.readObject();
			return ls;
		} catch (EOFException e) {
			System.out.println("=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("👍👍👍 NO WATCHES FOUND ✌️✌️✌️");
			return null;
		}
	}

	public void deleteWatchByBrand(String brand) throws Exception {
		List<Watch> displayWatches = displayWatches();
		if (!displayWatches.isEmpty()) {
			ListIterator<Watch> listIterator = displayWatches.listIterator();
			while (listIterator.hasNext()) {
				Watch watch = (Watch) listIterator.next();
				if (watch.getWatchBrand().equalsIgnoreCase(brand)) {
					listIterator.remove();
					storeWatches(displayWatches);
					System.out.println("Watch Deleted..");
				}
			}
		}
	}

	public void storeWatches(List<Watch> watches) throws Exception {
		File f = new File("D://Watch.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(watches);
		oos.flush();
		oos.close();
		fos.close();

	}

	public void updateOldByNewBrand(String oldBrand, String newBrand) throws Exception {
		List<Watch> displayWatches = displayWatches();
	    for (Watch watch : displayWatches) {
	    	if(watch.getWatchBrand().equalsIgnoreCase(oldBrand)) {
		    	watch.setWatchBrand(newBrand);
		    	System.out.println("watch Brand Updated Succesfully..");
	    	}
		}
	    storeWatches(displayWatches);
	}

	public void updateModelByBrand(String brand, String model) throws Exception {
		List<Watch> displayWatches = displayWatches();
	    for (Watch watch : displayWatches) {
	    	if(watch.getWatchBrand().equalsIgnoreCase(brand)) {
		    	watch.setWatchmodel(model);
		    	System.out.println("watch Model Updated Succesfully..");
	    	}
		}
	    storeWatches(displayWatches);

		
	}

}
