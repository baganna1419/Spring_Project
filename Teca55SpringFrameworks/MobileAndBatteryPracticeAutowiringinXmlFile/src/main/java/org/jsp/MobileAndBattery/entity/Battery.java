package org.jsp.MobileAndBattery.entity;

public class Battery {
	private int capacity;

	public Battery() {
	
	}

	public Battery(int capacity) {
		super();
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Battery [capacity=" + capacity + "]";
	}

}
