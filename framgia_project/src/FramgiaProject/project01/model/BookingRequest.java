package FramgiaProject.project01.model;

import java.sql.Date;

public class BookingRequest {
  private int id;
  private int tour_id, user_id, booking_number;
  private Date start_date, finish_date;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public Date getStart_date() {
	return start_date;
}
public void setStart_date(Date start_date) {
	this.start_date = start_date;
}
public int getBooking_number() {
	return booking_number;
}
public void setBooking_number(int booking_number) {
	this.booking_number = booking_number;
}
public Date getFinish_date() {
	return finish_date;
}
public void setFinish_date(Date finish_date) {
	this.finish_date = finish_date;
}
public int getTour_id() {
	return tour_id;
}
public void setTour_id(int tour_id) {
	this.tour_id = tour_id;
}
}

