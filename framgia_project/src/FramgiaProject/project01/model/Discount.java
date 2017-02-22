package FramgiaProject.project01.model;

import java.util.Date;

public class Discount {
  private int id;
  private int value, type, target_id, status;
  private Date start_date, end_date;
  private String target_type;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
public Date getEnd_date() {
	return end_date;
}
public void setEnd_date(Date end_date) {
	this.end_date = end_date;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public Date getStart_date() {
	return start_date;
}
public void setStart_date(Date start_date) {
	this.start_date = start_date;
}
public int getTarget_id() {
	return target_id;
}
public void setTarget_id(int target_id) {
	this.target_id = target_id;
}
public String getTarget_type() {
	return target_type;
}
public void setTarget_type(String target_type) {
	this.target_type = target_type;
}
public int getType() {
	return type;
}
public void setType(int type) {
	this.type = type;
}
}
