package org.jsp.annotation.entity;

import java.io.Serializable;

public class Watch implements Serializable {

	// properties of watch
	private String watchBrand;
	private String watchType;
	private double watchPrice;
	private String watchColor;
	private String watchModel;

	// No-Argumented Constructor
	public Watch() {
	}

	// Setter and getter Methods
	public String getWatchBrand() {
		return watchBrand;
	}

	public void setWatchBrand(String watchBrand) {
		this.watchBrand = watchBrand;
	}

	public String getWatchType() {
		return watchType;
	}

	public void setWatchType(String watchType) {
		this.watchType = watchType;
	}

	public double getWatchPrice() {
		return watchPrice;
	}

	public void setWatchPrice(double watchPrice) {
		this.watchPrice = watchPrice;
	}

	public String getWatchColor() {
		return watchColor;
	}

	public void setWatchColor(String watchColor) {
		this.watchColor = watchColor;
	}

	public String getWatchModel() {
		return watchModel;
	}

	public void setWatchModel(String watchModel) {
		this.watchModel = watchModel;
	}

	@Override
	public String toString() {
		return " Brand Name is     : " + getWatchBrand() + " " + "\n Type of Watch  : " + getWatchType() + " "
				+ "\n Price of Watch : " + getWatchPrice() + " " + "\n Color Of Watch : " + getWatchColor() + " "
				+ "\n Model Of Watch : " + getWatchModel()
				+ "\n**************************************************************";
	}

}
