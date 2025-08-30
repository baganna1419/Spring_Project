package org.jsp.assignment;

public class Bike {
	
	private String name;
	private double cost;
	private String color;
	private Petrol petrol;

	public Bike() {
	}
	
	public Bike(String name, double cost, String color, Petrol petrol) {
		this.name = name;
		this.cost = cost;
		this.color = color;
		this.petrol = petrol;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Petrol getPetrol() {
		return petrol;
	}

	public void setPetrol(Petrol petrol) {
		this.petrol = petrol;
	}
	
	@Override
	public String toString() {
		return "Bike [name=" + name + ", cost=" + cost + ", color=" + color + ", petrol=" + petrol + "]";
	}

}
