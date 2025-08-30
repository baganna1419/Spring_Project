package org.jsp.annotation.service;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import org.jsp.annotation.dao.WatchDao;
import org.jsp.annotation.entity.Watch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("service")
public class WatchServiceImplementation implements WatchService {

	Scanner sc = new Scanner(System.in);
	@Autowired
	WatchDao dao;
	public void addWatch() throws Exception {
		System.out.print("%%% Enter the WATCH BRAND %%% :");
		String brand = sc.next();
		System.out.print("%%% Enter the WATCH TYPE %%% :");
		String type = sc.next();
		System.out.print("%%% Enter the WATCH PRICE %%% :");
		double price = sc.nextDouble();
		System.out.print("%%% Enter the WATCH COLOR %%% :");
		String color = sc.next();
		System.out.print("%%% Enter the WATCH MODEL %%% :");
		String model = sc.next();
		Watch watch = new Watch();
		watch.setWatchBrand(brand);
		watch.setWatchType(type);
		watch.setWatchPrice(price);
		watch.setWatchColor(color);
		watch.setWatchmodel(model);
		
		dao.insertWatch(watch);
	}
	public void getWatches() throws Exception 
	{
		List<Watch> ls = dao.displayWatch();
		if(ls!=null)
		{
		ListIterator<Watch> it = ls.listIterator();
		while(it.hasNext())
		{
			Watch watch = it.next();
			System.out.println("---++++++++++++++++++++++++++++++++++----");
			System.out.println("          $$$ WATCH DETAILS $$$");
			System.out.println("---++++++++++++++++++++++++++++++++++----");
			System.out.println("WATCH BRAND : "+watch.getWatchBrand());
			System.out.println("WATCH TYPE : "+watch.getWatchType());
			System.out.println("WATCH PRICE : "+watch.getWatchPrice());
			System.out.println("WATCH COLOR : "+watch.getWatchColor());
			System.out.println("WATCH MODEL : "+watch.getWatchmodel());
			System.out.println("---++++++++++++++++++++++++++++++++++----");
		}
		}
	}


}
