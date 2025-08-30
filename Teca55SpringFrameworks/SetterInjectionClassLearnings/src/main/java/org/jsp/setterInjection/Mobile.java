package org.jsp.setterInjection;

public class Mobile {
	private String brand;
	private String color;
	private String model;
	private double price;
	private String camera;
	private int rom;
	private int ram;
	private Battery battery;

	public Mobile() {
		System.out.println("No-Argument Constructor of Mobile Class..");
	}

	public String getBrand() {
		System.out.println("Setter method of Mobile class For Brand");
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		System.out.println("Setter method of Mobile class For color");

		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		System.out.println("Setter method of Mobile class For Model");

		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setter method of Mobile class For Price");

		this.price = price;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		System.out.println("Setter method of Mobile class For Camera");

		this.camera = camera;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		System.out.println("Setter method of Mobile class For Rom");

		this.rom = rom;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		System.out.println("Setter method of Mobile class For Rom");

		this.ram = ram;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", color=" + color + ", model=" + model + ", price=" + price + ", camera="
				+ camera + ", rom=" + rom + ", ram=" + ram + ", battery=" + battery + "]";
	}
	
	

}
