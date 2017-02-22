package FramgiaProject.project01.model;

public class Activity {
  private int id;
  private int user_id, target_id;
  private String target_name, action_name;
  
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
public int getTarget_id() {
	return target_id;
}
public void setTarget_id(int target_id) {
	this.target_id = target_id;
}
public String getTarget_name() {
	return target_name;
}
public void setTarget_name(String target_name) {
	this.target_name = target_name;
}
public String getAction_name() {
	return action_name;
}
public void setAction_name(String action_name) {
	this.action_name = action_name;
}
}

