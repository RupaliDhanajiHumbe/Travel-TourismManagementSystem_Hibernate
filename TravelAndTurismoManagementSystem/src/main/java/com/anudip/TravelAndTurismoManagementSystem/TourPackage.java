package com.anudip.TravelAndTurismoManagementSystem;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TourPackage {
	
	    @Id
	    private int id;
	    private String packageName;     //
	    private String description;
	    private double price;
	    private int duration;
	    private String destination;
	    
	    @OneToMany(cascade=CascadeType.ALL,mappedBy="tourPackage")
	    private List<TourDate> tourDates; // One-to-Many relationship with TourDate
	    
	    @OneToMany(cascade=CascadeType.ALL,mappedBy="tourPackage")
	    private List<Booking> bookings; // One-to-Many relationship with Booking
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getPackageName() {
			return packageName;
		}
		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public List<TourDate> getTourDates() {
			return tourDates;
		}
		public void setTourDates(List<TourDate> tourDates) {
			this.tourDates = tourDates;
		}
		public List<Booking> getBookings() {
			return bookings;
		}
		public void setBookings(List<Booking> bookings) {
			this.bookings = bookings;
		}
		
		public TourPackage() {
			super();
			// TODO Auto-generated constructor stub
		}
}
