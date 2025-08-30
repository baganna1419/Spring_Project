package org.jsp.assigment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mouse {
	
	@Value("Wireless")
	private String type;
	@Value("Red")
	private String color;
	@Value("1789")
	private double cost;
	public Mouse() {
		
	}
	public Mouse(String type, String color, double cost) {
		this.type = type;
		this.color = color;
		this.cost = cost;
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
	@Override
	public String toString() {
		return "Mouse [type=" + type + ", color=" + color + ", cost=" + cost + "]";
	}
	
	

}
