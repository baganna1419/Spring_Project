package org.jsp.annotations;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Bike {
//	@Value("Honda")
	private String brand;
//	@Value("Black")
	private String color;
// 	@Value("120000")
	private double price;
	private Date date;
    private int price1;
	public Bike() {
		System.out.println("No-Argument Constructor of Bike class...!!!!");
	}
//    @Autowired
	public Bike(String brand,  String color, double price,Date date) {
		System.out.println("Argument Constructor of Bike class...!!!!");
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.date=date;
	}
//    @Value("Hero")
	public void setBrand(String brand) {
		System.out.println("Setter Method Brand");
		this.brand = brand;
	}
//    @Value("Black")
	public void setColor(String color) {
		System.out.println("Setter Method Color");

		this.color = color;
	}
//    @Value("1000000")
	public void setPrice(double price) {
		System.out.println("Setter Method Price ");

		this.price = price;
	}
    
	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", color=" + color + ", price=" + price + ", date=" + date + "]";
	}
	

}
