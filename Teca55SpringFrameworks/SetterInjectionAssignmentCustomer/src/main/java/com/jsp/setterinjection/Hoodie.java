package com.jsp.setterinjection;

public class Hoodie implements Product {

	private String type;
	private String color;
	private double cost;
	private int quantity;
	private String size;

	public Hoodie() {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Hoodie [type=" + type + ", color=" + color + ", cost=" + cost + ", quantity=" + quantity + ", size="
				+ size + "]";
	}

	public void getProductInfo() {
		toString();

	}

}
