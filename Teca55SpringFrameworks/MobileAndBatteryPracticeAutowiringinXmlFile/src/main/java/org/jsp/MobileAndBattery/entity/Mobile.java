package org.jsp.MobileAndBattery.entity;

public class Mobile {
	private String brand;
	private double price;
	private String color;
	private Battery battery;
		
	public Mobile() {
	
	}

	public Mobile(String brand, double price, String color, Battery battery) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.battery = battery;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", color=" + color + ", battery=" + battery + "]";
	}
	 

}
