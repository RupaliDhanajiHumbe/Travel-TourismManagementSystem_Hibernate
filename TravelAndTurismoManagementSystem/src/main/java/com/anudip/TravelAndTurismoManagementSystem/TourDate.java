package com.anudip.TravelAndTurismoManagementSystem;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class TourDate {
	
	    @Id
	    private int id;
	    private int availableSeats;          //  How many seats are available 
	    private String tourDate;
	    
	    @ManyToOne(cascade=CascadeType.ALL)
	    private TourPackage tourPackage; // Many-to-One relationship with TourPackage
	    
	    @OneToMany(cascade=CascadeType.ALL,mappedBy="tourDate")
	    private List<Booking> bookings; // One-to-Many relationship with Booking
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getAvailableSeats() {
			return availableSeats;
		}
		public void setAvailableSeats(int availableSeats) {
			this.availableSeats = availableSeats;
		}
		
		public String getTourDate() {
			return tourDate;
		}
		public void setTourDate(String tourDate) {
			this.tourDate = tourDate;
		}
		public TourPackage getTourPackage() {
			return tourPackage;
		}
		public void setTourPackage(TourPackage tourPackage) {
			this.tourPackage = tourPackage;
		}
		public List<Booking> getBookings() {
			return bookings;
		}
		public void setBookings(List<Booking> bookings) {
			this.bookings = bookings;
		}
		public TourDate() {
			super();
			// TODO Auto-generated constructor stub
		}
}
