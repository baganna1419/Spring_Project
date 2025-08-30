package org.jsp.setterInjection;

public class CurrentAddress implements Address {
	private String doorNumber;
	private int streetNumber;
	private String area;
	private String landmark;
	private String city;
	private String state;
	private String nation;

	public CurrentAddress() {
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	@Override
	public String toString() {
		return "CurrentAddress [doorNumber=" + doorNumber + ", streetNumber=" + streetNumber + ", area=" + area
				+ ", landmark=" + landmark + ", city=" + city + ", state=" + state + ", nation=" + nation + "]";
	}

	public void getAddress() {
		toString();

	}

}
