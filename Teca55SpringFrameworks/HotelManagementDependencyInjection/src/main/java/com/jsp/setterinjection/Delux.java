package com.jsp.setterinjection;

public class Delux implements Type {
	private String type;
	private String typeOfRoom;

	public Delux() {
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
		return "Delux [type=" + type + ", typeOfRoom=" + typeOfRoom + "]";
	}

	public void getInfo() {
		toString();
	}

}
