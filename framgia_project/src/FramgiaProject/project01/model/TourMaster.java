package FramgiaProject.project01.model;

public class TourMaster {
  private int id;
  private String name, description;
  private int price, days, category_id;
  

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCategory_id() {
	return category_id;
}
public void setCategory_id(int category_id) {
	this.category_id = category_id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getDays() {
	return days;
}
public void setDays(int days) {
	this.days = days;
}
}
