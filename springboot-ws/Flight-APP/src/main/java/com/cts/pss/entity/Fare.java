package com.cts.pss.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(schema = "test16")
public class Fare {

	@Id
	@GeneratedValue
	private int fareId;
	private String currency;
	private double amount;
	
	
	public Fare() {
		// TODO Auto-generated constructor stub
	}

	public Fare(String currency, double amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public int getFareId() {
		return fareId;
	}

	public void setFareId(int fareId) {
		this.fareId = fareId;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
