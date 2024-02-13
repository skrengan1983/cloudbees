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
private String first_name;
@Column
private String last_name;
@Column
private String email_address;
public TrainUser() {
	super();
}
public TrainUser(Integer id, String first_name, String last_name, String email_address) {
	super();
	this.id = id;
	this.first_name = first_name;
	this.last_name = last_name;
	this.email_address = email_address;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getEmail_address() {
	return email_address;
}
public void setEmail_address(String email_address) {
	this.email_address = email_address;
}
@Override
public String toString() {
	return "TrainUser [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email_address="
			+ email_address + "]";
}
}
