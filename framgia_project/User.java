public class User {  
private int id;  
private String name, email, phone_number, banking_account, password;
private int role;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRole() {
	return role;
}
public void setRole(int role) {
	this.role = role;
}
public String getPhone_number() {
	return phone_number;
}
public void setPhone_number(String phone_number) {
	this.phone_number = phone_number;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getBanking_account() {
	return banking_account;
}
public void setBanking_account(String banking_account) {
	this.banking_account = banking_account;
}  
  
} 