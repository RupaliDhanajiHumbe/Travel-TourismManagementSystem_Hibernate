package com.anudip.TravelAndTurismoManagementSystem;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Booking {
	
	    @Id	
	    private int id;
	    private int numberOfSeats;
	    private double totalCost;
	    private String bookingStatus;     // online/offline
	    
	    @ManyToOne(cascade=CascadeType.ALL)
	    private User user; // Many-to-One relationship with User
	    
	    @ManyToOne(cascade=CascadeType.ALL)
	    private TourPackage tourPackage; // Many-to-One relationship with TourPackage
	    
	    @ManyToOne(cascade=CascadeType.ALL)
	    private TourDate tourDate; // Many-to-One relationship with TourDate
	    
	    @OneToMany(cascade=CascadeType.ALL,mappedBy="booking")                           
	    private List<Payment> payment; // One-to-One relationship with Payment
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public TourPackage getTourPackage() {
			return tourPackage;
		}
		public void setTourPackage(TourPackage tourPackage) {
			this.tourPackage = tourPackage;
		}
		
		public TourDate getTourDate() {
			return tourDate;
		}
		public void setTourDate(TourDate tourDate) {
			this.tourDate = tourDate;
		}
		public int getNumberOfSeats() {
			return numberOfSeats;
		}
		public void setNumberOfSeats(int numberOfSeats) {
			this.numberOfSeats = numberOfSeats;
		}
		public double getTotalCost() {
			return totalCost;
		}
		public void setTotalCost(double totalCost) {
			this.totalCost = totalCost;
		}
		public String getBookingStatus() {
			return bookingStatus;
		}
		public void setBookingStatus(String bookingStatus) {
			this.bookingStatus = bookingStatus;
		}
		
		public List<Payment> getPayment() {
			return payment;
		}
		public void setPayment(List<Payment> payment) {
			this.payment = payment;
		}
		public Booking() {
			super();
			// TODO Auto-generated constructor stub
		}
}
