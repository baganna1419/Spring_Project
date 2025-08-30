package com.jsp.coupling;

public class Mobile {
	private SimCard simCard;
	private Battery battery;
	public void getSim() {
		simCard=new Airtel();
		simCard.simInfo();
	}
	public void getBattery() {
		battery=new Samsung();
		battery.batteryInfo();
	}

}
