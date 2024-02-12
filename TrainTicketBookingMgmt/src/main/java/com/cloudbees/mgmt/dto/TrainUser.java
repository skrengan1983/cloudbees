package com.cloudbees.mgmt.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="train_user")
public class TrainUser {
@Id
@Column
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
@Column
private String firstName;
@Column
private String lastName;
@Column
private String emailAddress;
public TrainUser() {
	super();
}
public TrainUser(Integer id, String firstName, String lastName, String emailAddress) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailAddress = emailAddress;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}
}
