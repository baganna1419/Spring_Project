package org.jsp.setterInjection;

public class NickelBattery implements Battery {

	private String brand;
	private String capacity;
	private int cost;

	public NickelBattery() {
		System.out.println("NickelBattery Class No-argumented Constructor..");

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "NickelBattery [brand=" + brand + ", capacity=" + capacity + ", cost=" + cost + "]";
	}
	
	public void batteryInfo() {
		toString();

	}
	
	

}
