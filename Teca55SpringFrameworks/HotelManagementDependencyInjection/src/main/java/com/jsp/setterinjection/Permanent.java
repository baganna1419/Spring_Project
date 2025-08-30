package com.jsp.setterinjection;

public class Permanent implements Address {
	private String houseNum;
	private String landmark;
	private String area;
	private String state;
	private String city;
	private String nation;

	public Permanent() {
	}

	public String getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
	
	

	@Override
	public String toString() {
		return "Permanent [houseNum=" + houseNum + ", landmark=" + landmark + ", area=" + area + ", state=" + state
				+ ", city=" + city + ", nation=" + nation + "]";
	}

	public void getInfo() {
		toString();
	}

}
