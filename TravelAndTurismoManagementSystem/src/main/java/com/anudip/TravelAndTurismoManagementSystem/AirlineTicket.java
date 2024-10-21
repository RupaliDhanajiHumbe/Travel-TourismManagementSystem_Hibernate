package com.anudip.TravelAndTurismoManagementSystem;

import javax.persistence.Entity;

@Entity
public class AirlineTicket {
	
	private int id;
    private String passengerName;
    private String flightNumber;
    private String departureDate;
    private String returnDate;
    private String departureAirport;
    private String arrivalAirport;
    private String seatClass;
    private double fare;
    private boolean isBooked;

    // Constructor
    public AirlineTicket(int id, String passengerName, String flightNumber, String departureDate, String returnDate, String departureAirport, String arrivalAirport, String seatClass, double fare) {
        this.id = id;
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.seatClass = seatClass;
        this.fare = fare;
        this.isBooked = false;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public String getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}

	public String getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public String getSeatClass() {
		return seatClass;
	}

	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
}
