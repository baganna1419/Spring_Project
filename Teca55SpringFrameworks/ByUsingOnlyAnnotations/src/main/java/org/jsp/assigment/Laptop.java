package org.jsp.assigment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Value("Dell")
	private String name;
	@Value("Intel")
	private String brand;
	@Value("Black")
	private String color;
	@Autowired
	private Keyboard keyboard;
	@Autowired
	private CPU cpu;
	private Mouse mouse;
	
	public Laptop() {
		
	}

	public Laptop(String name, String brand, String color, Keyboard keyboard, CPU cpu, Mouse mouse) {
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.keyboard = keyboard;
		this.cpu = cpu;
		this.mouse = mouse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", brand=" + brand + ", color=" + color + ", keyboard=" + keyboard + ", cpu="
				+ cpu + ", mouse=" + mouse + "]";
	}
	
	
	
	
	
	

}
