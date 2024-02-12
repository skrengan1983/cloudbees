package com.cloudbees.mgmt.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="train_ticket_booking")
public class TrainTicketBooking {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String user;
	@Column
	private String from;
	@Column
	private String to;
	@Column
	private Double pricePaid;
	
	public TrainTicketBooking() {
		super();
	}
	public TrainTicketBooking(Integer id, String user, String from, String to, Double pricePaid) {
		super();
		this.id = id;
		this.user = user;
		this.from = from;
		this.to = to;
		this.pricePaid = pricePaid;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Double getPricePaid() {
		return pricePaid;
	}
	public void setPricePaid(Double pricePaid) {
		this.pricePaid = pricePaid;
	}
}
