package org.jsp.dependencyInjection;

import java.util.Date;

public class MessageCreater {
	//Dependency class
	private Date date;

	public MessageCreater() {
	}

	public MessageCreater(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setTime(Date date) {
		this.date = date;
	}

	public void displayMessage(String username) {
		int hour = date.getHours();
		System.out.println(date);
		if (hour <= 12 && hour > 4)
			System.out.println("Good Morning  : " + username);
		else if (hour < 16)
			System.out.println("Good Afternoon : " + username);
		else if (hour < 20)
			System.out.println("Good Evening   : " + username);
		else if(hour<24) System.out.println("Good Night :" +username);
	}

}
