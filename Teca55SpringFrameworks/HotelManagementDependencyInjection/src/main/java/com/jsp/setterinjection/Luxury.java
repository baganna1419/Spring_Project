package com.jsp.setterinjection;

public class Luxury implements Type {
	private String type;
	private String typeOfRoom;

	public Luxury() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeOfRoom() {
		return typeOfRoom;
	}

	public void setTypeOfRoom(String typeOfRoom) {
		this.typeOfRoom = typeOfRoom;
	}

	@Override
	public String toString() {
		return "Luxury [type=" + type + ", typeOfRoom=" + typeOfRoom + "]";
	}

	public void getInfo() {
		toString();
	}

}
