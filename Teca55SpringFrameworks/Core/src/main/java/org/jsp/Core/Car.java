package org.jsp.Core;

public class Car {
	private String carName;
	private String carBrand;
	private int milage;
	private String color;
	private double price;
	
	public Car() {
	}

	public Car(String carName, String carBrand, int milage, String color, double price) {
		super();
		this.carName = carName;
		this.carBrand = carBrand;
		this.milage = milage;
		this.color = color;
		this.price = price;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carBrand=" + carBrand + ", milage=" + milage + ", color=" + color
				+ ", price=" + price + "]";
	}
	
	
	
	
	
	

}
