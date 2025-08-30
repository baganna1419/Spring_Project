package org.jsp.annotation.entity;

public class Watch {

	@Override
	public String toString() {
		return "Watch [watchBrand=" + watchBrand + ", watchType=" + watchType + ", watchPrice=" + watchPrice
				+ ", watchColor=" + watchColor + ", watchmodel=" + watchmodel + "]";
	}

	// Properties
	private String watchBrand;
	private String watchType;
	private double watchPrice;
	private String watchColor;
	private String watchmodel;

	// No-Argument constructor
	public Watch() {

	}
	// Getter and Setter

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

	public String getWatchmodel() {
		return watchmodel;
	}

	public void setWatchmodel(String watchmodel) {
		this.watchmodel = watchmodel;
	}

	

}
