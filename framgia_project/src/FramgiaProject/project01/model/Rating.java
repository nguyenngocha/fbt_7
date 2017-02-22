package FramgiaProject.project01.model;

public class Rating {
  private int id;
  private int tour_id, user_id, star;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getStar() {
	return star;
}
public void setStar(int star) {
	this.star = star;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public int getTour_id() {
	return tour_id;
}
public void setTour_id(int tour_id) {
	this.tour_id = tour_id;
}
}
