package com.anudip.TravelAndTurismoManagementSystem;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration conf=new Configuration().configure().addAnnotatedClass(User.class)
    			.addAnnotatedClass(Booking.class).addAnnotatedClass(TourPackage.class)
    			.addAnnotatedClass(TourDate.class).addAnnotatedClass(Room.class)
    			.addAnnotatedClass(Hotel.class).addAnnotatedClass(Transportation.class)
    			.addAnnotatedClass(Payment.class);
    	SessionFactory sFactory=conf.buildSessionFactory();
    	Session session=sFactory.openSession();
    	Transaction t1=session.beginTransaction();
    	
    	List<Booking> booking=new ArrayList<>();
    	Booking b1=new Booking();
    	b1.setId(111);
    	b1.setNumberOfSeats(5);
    	b1.setTotalCost(1500);
    	b1.setBookingStatus("Online");
    	session.save(b1);
    
    	User u1=new User();
    	u1.setId(111);
    	u1.setUsername("Rahul");
    	u1.setPassword("Rahul@123");
    	u1.setEmail("rahul123@gmail.com");
    	u1.setPhoneNumber("8625011755");
    	u1.setAddress("Pune");
    	u1.setBookings(booking);
   
    	List<Room> rooms=new ArrayList<>();
    	Room r1=new Room();
    	r1.setId(111);
    	r1.setPrice(1000);
    	r1.setRoomType("Single");
    	session.save(r1);
    	
    	Hotel h1=new Hotel();
    	h1.setId(111);
    	h1.setHotelName("DreamLine");
    	h1.setRating(5);
    	h1.setAddress("Pandharpur");
    	h1.setCity("Pandharpur");
    	h1.setCountry("India");
        h1.setRooms(rooms);
        session.persist(h1);
    	
    	List<TourDate> tourdate=new ArrayList<>();
    	TourDate td=new TourDate();
    	td.setId(111);
    	td.setTourDate("21/10/2024");
    	td.setAvailableSeats(5);
    	td.setBookings(booking);

    	TourPackage  tp=new TourPackage();
    	tp.setId(111);
    	tp.setPackageName("GOLD package");
    	tp.setDescription("6Day & 7Night,Airport Assistance,"
    			+ "Half Day City Tour,English Speaking Guide");
    	tp.setDuration(5);
    	tp.setDestination("Kokan");
    	tp.setPrice(150000);
    	tp.setBookings(booking);
    	tp.setTourDates(tourdate);
		
		 List<Payment> payment=new ArrayList<>();
		 Payment p=new Payment();
		 p.setId(111);
         p.setAmount(50000); 
         p.setPaymentMethod("Online");
		 p.setPaymentDate("23/10/2024"); 
         p.setBooking(b1);
         session.persist(p);
         
         Transportation tr=new Transportation();
         tr.setId(111);
         tr.setPrice(50000);
         tr.setFromLocation("Pandharpur");
         tr.setToLocation("Mahabaleshwar");
         tr.setTransportationType("Bus");
         session.save(tr);
		 
    	b1.setUser(u1);
    	booking.add(b1);
    	u1.setBookings(booking);
    	session.persist(u1);    	
    	
    	b1.setTourPackage(tp);
    	booking.add(b1);
    	tp.setBookings(booking);
    	session.persist(tp);
    	
    	b1.setTourDate(td);
    	booking.add(b1);
    	td.setBookings(booking);
    	session.persist(td);
    	
    	r1.setHotel(h1);
    	rooms.add(r1);
    	h1.setRooms(rooms);
    	session.persist(h1);
    	
    	p.setBooking(b1);
    	payment.add(p);
        b1.setPayment(payment);
    	session.persist(b1);
    	
        td.setTourPackage(tp);
        tourdate.add(td);
        tp.setTourDates(tourdate);
        session.persist(tp);
        
        t1.commit();
    	
    }
}
