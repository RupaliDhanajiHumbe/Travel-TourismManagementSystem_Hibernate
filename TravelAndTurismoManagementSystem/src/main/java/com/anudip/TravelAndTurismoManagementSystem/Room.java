package com.anudip.TravelAndTurismoManagementSystem;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Room {
	
	@Id
	private int id;              
    private String roomType;             //  Single or Dubble
    private double price;
    
    @ManyToOne(cascade=CascadeType.ALL)
    private Hotel hotel;                // Many-to-One relationship with hotel
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
    


}
