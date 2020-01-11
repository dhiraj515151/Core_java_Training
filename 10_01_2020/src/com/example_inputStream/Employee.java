package com.example_inputStream;
import java.io.Serializable;

public class Employee implements Serializable {
private String firstname;
private String lastname;
private String email;
public Employee(String firstname, String lastname, String email) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Name: "+getFirstname()+" "+getLastname()+"\nEmail: "+getEmail();
}

}
