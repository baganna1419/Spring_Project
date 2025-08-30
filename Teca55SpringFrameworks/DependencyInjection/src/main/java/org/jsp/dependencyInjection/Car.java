package org.jsp.dependencyInjection;

public class Car {
	// Properties
	private String carName;
	private String carBrand;
	private String color;
	private double price;
	private int milage;
	private Engine engine;

	// No-Argumented Constructor
	public Car() {
		System.out.println("No-Argumented Constructor of car class..!!");
	}

	// Argumented Constructor
	public Car(String carName, String carBrand, String color, double price, int milage, Engine engine) {
		System.out.println("Argumented Constructor of car class..!!");
		this.carName = carName;
		this.carBrand = carBrand;
		this.color = color;
		this.price = price;
		this.milage = milage;
		this.engine = engine;
	}

	// Setter and Getter
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
		return "Car [carName=" + carName + ", carBrand=" + carBrand + ", color=" + color + ", price=" + price
				+ ", milage=" + milage + ", engine=" + engine + "]";
	}


}
