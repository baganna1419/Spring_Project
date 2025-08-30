package org.jsp.assignment;

public class Hp95 implements Petrol {
	
	private String brand;
	private double cost;
	private int milage;

	public Hp95() {
	}

	public Hp95(String brand, double cost, int milage) {
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

	@Override
	public String toString() {
		return "Hp95 [brand=" + brand + ", cost=" + cost + ", milage=" + milage + "]";
	}
	public void getInfo() {
		System.out.println("Brand : " + getBrand());
		System.out.println("Cost : " + getCost());
		System.out.println("Milage : " + getMilage());

	}

}
