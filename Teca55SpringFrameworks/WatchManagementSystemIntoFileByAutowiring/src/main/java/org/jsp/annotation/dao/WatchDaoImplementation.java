package org.jsp.annotation.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.jsp.annotation.entity.Watch;
import org.springframework.stereotype.Component;
@Component()
public class WatchDaoImplementation implements WatchDao {
	List<Watch> database = new ArrayList<Watch>();
	public List<Watch> takeOld() throws Exception {
		File f = new File("D://watchManagement.txt");
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
			File f = new File("D://watchManagement.txt");
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

		public List<Watch> displayWatch() throws Exception {
			List<Watch> ls = new ArrayList<Watch>();
			File f = new File("D://watchManagement.txt");
			try {
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
	
}
