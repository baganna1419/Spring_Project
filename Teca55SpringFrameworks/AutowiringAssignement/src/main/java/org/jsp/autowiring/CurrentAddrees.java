package org.jsp.autowiring;

public class CurrentAddrees implements Address {
	private String hno;
	private String location;
	private String landmark;
	private String state;
	private String nation;

	public CurrentAddrees() {

	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
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
		return "CurrentAddrees [hno=" + hno + ", location=" + location + ", landmark=" + landmark + ", state=" + state
				+ ", nation=" + nation + "]";
	}
	
	

}
