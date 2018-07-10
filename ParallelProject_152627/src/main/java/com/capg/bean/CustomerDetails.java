package com.capg.bean;

public class CustomerDetails {
private String name;
private String phoneNo;
private String email;
private int age;
private String username;
private String password;
private String gender;
private int accNo;
private double balance;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
	
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "CustomerDetails [name=" + name + ", phoneNo=" + phoneNo + ", email=" + email + ", age=" + age
			+ ", username=" + username + ", password=" + password + ", gender=" + gender + ", accNo=" + accNo + "]";
}


}
