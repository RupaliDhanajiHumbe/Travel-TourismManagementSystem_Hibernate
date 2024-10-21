package com.anudip.TravelAndTurismoManagementSystem;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transportation {
	    
	    @Id
	    private int id;
	    private String transportationType;
	    private String fromLocation;
	    private String toLocation;
	    private double price;
	   // private Date departureDate;     // outgoing date
	    //private Date arrivalDate;        // their goes date
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTransportationType() {
			return transportationType;
		}
		public void setTransportationType(String transportationType) {
			this.transportationType = transportationType;
		}
		public String getFromLocation() {
			return fromLocation;
		}
		public void setFromLocation(String fromLocation) {
			this.fromLocation = fromLocation;
		}
		public String getToLocation() {
			return toLocation;
		}
		public void setToLocation(String toLocation) {
			this.toLocation = toLocation;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		public Transportation() {
			super();
			// TODO Auto-generated constructor stub
		}

		
	    

}
