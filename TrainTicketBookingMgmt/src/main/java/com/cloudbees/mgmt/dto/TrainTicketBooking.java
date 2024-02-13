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
	private String t_user;
	@Column
	private String t_from;
	@Column
	private String t_to;
	@Column
	private Double price_paid;
	
	public TrainTicketBooking() {
		super();
	}

	public TrainTicketBooking(Integer id, String t_user, String t_from, String t_to, Double price_paid) {
		super();
		this.id = id;
		this.t_user = t_user;
		this.t_from = t_from;
		this.t_to = t_to;
		this.price_paid = price_paid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getT_user() {
		return t_user;
	}

	public void setT_user(String t_user) {
		this.t_user = t_user;
	}

	public String getT_from() {
		return t_from;
	}

	public void setT_from(String t_from) {
		this.t_from = t_from;
	}

	public String getT_to() {
		return t_to;
	}

	public void setT_to(String t_to) {
		this.t_to = t_to;
	}

	public Double getPrice_paid() {
		return price_paid;
	}

	public void setPrice_paid(Double price_paid) {
		this.price_paid = price_paid;
	}

	@Override
	public String toString() {
		return "TrainTicketBooking [id=" + id + ", t_user=" + t_user + ", t_from=" + t_from + ", t_to=" + t_to
				+ ", price_paid=" + price_paid + "]";
	}
	
}