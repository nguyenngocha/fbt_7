package FramgiaProject.project01.model;

public class Review {
  private int id;
  private String name, content;
  private int tour_id;
  private int user_id;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public int getTour_id() {
	return tour_id;
}
public void setTour_id(int tour_id) {
	this.tour_id = tour_id;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
}

