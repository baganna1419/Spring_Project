package org.jsp.autowiring;

public class Kukatpally implements Branch {
	private int yearOfEstablishement;
	private String mobileNumber;
	private String state;
	private String country;
	
	public Kukatpally() {

	}

	public int getYearOfEstablishement() {
		return yearOfEstablishement;
	}

	public void setYearOfEstablishement(int yearOfEstablishement) {
		this.yearOfEstablishement = yearOfEstablishement;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Kukatpally [yearOfEstablishement=" + yearOfEstablishement + ", mobileNumber=" + mobileNumber
				+ ", state=" + state + ", country=" + country + "]";
	}
	
	
	
	
	

}
