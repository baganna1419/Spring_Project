package com.jsp.setterinjection;

public class HotelManagement {
	private String name;
	private Address address;
	private int numberOfRooms;
	private Customer customer;
	private double price;
	private int ratings;
	private Type type;
	private int numberOfRoomsOccupied;
	private int numberOfRoomsEmpty;
	public HotelManagement() {
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public int getNumberOfRoomsOccupied() {
		return numberOfRoomsOccupied;
	}
	public void setNumberOfRoomsOccupied(int numberOfRoomsOccupied) {
		this.numberOfRoomsOccupied = numberOfRoomsOccupied;
	}
	public int getNumberOfRoomsEmpty() {
		return numberOfRoomsEmpty;
	}
	public void setNumberOfRoomsEmpty(int numberOfRoomsEmpty) {
		this.numberOfRoomsEmpty = numberOfRoomsEmpty;
	}
	@Override
	public String toString() {
		return "HotelManagement [name=" + name + ", address=" + address + ", numberOfRooms=" + numberOfRooms
				+ ", customer=" + customer + ", price=" + price + ", ratings=" + ratings + ", type=" + type
				+ ", numberOfRoomsOccupied=" + numberOfRoomsOccupied + ", numberOfRoomsEmpty=" + numberOfRoomsEmpty
				+ "]";
	}
	
	
	

}
