package org.jsp.assigment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Keyboard {
	@Value("Wired")
	private String type;
	@Value("1234")
	private double cost;
	
	
	public Keyboard() {
		
	}


	public Keyboard(String type, double cost) {

		this.type = type;
		this.cost = cost;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "Keyboard [type=" + type + ", cost=" + cost + "]";
	}
	
	

}
