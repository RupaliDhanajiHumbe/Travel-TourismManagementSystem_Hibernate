package com.anudip.TravelAndTurismoManagementSystem;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hotel {
	
	    @Id
	    private int id;
	    private String hotelName;
	    private String address;
	    private String city;
	    private String country;
	    private int rating;
	    
	    @OneToMany(cascade=CascadeType.ALL,mappedBy="hotel")
	    private List<Room> rooms;                            // One-to-Many relationship with rooms
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getHotelName() {
			return hotelName;
		}
		public void setHotelName(String hotelName) {
			this.hotelName = hotelName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
		public List<Room> getRooms() {
			return rooms;
		}
		public void setRooms(List<Room> rooms) {
			this.rooms = rooms;
		}
		
		public Hotel() {
			super();
			// TODO Auto-generated constructor stub
		}

}
