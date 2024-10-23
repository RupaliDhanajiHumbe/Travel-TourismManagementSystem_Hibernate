package com.anudip.TravelAndTurismoManagementSystem;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Payment {
	
	@Id
	private int id;
    private double amount;
    private String paymentMethod;
    private String paymentDate;
    
    @ManyToOne(cascade=CascadeType.ALL)
    private Booking booking;     // Many-to-One relationship with User
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
    
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
