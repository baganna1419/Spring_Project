package com.jsp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Rooms {
	@Id
	private int roomId;
	private int roomNumber;
	private int capacity;
	private String occupancyStatus;
	private int floorId;

}
