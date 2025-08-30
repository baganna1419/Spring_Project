package org.jsp.assignment;

public class Power implements Petrol {

	@Override
	public String toString() {
		return "Power [brand=" + brand + ", cost=" + cost + ", milage=" + milage + "]";
	}

	private String brand;
	private double cost;
	private int milage;

	public Power() {
	}

	public Power(String brand, double cost, int milage) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.milage = milage;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public void getInfo() {
		System.out.println("Brand : " + getBrand());
		System.out.println("Cost : " + getCost());
		System.out.println("Milage : " + getMilage());

	}

}
