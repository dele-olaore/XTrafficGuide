package com.iox.xtraffic.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class RouteSubscription implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
    @GeneratedValue
	private Long id;
	@ManyToOne
	private Route route;
	@ManyToOne
	private Customer customer;
	@ManyToOne
	private ChargeRate chargeRate;
	private double subscription_amt;
	@Temporal(TemporalType.TIMESTAMP)
	private Date subscription_dt;
	@Temporal(TemporalType.TIMESTAMP)
	private Date expity_dt;
	
	private boolean expired;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date crt_dt;
	
	public RouteSubscription()
	{}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ChargeRate getChargeRate() {
		return chargeRate;
	}

	public void setChargeRate(ChargeRate chargeRate) {
		this.chargeRate = chargeRate;
	}

	public double getSubscription_amt() {
		return subscription_amt;
	}

	public void setSubscription_amt(double subscription_amt) {
		this.subscription_amt = subscription_amt;
	}

	public Date getSubscription_dt() {
		return subscription_dt;
	}

	public void setSubscription_dt(Date subscription_dt) {
		this.subscription_dt = subscription_dt;
	}

	public Date getExpity_dt() {
		return expity_dt;
	}

	public void setExpity_dt(Date expity_dt) {
		this.expity_dt = expity_dt;
	}

	public boolean isExpired() {
		return expired;
	}

	public void setExpired(boolean expired) {
		this.expired = expired;
	}

	public Date getCrt_dt() {
		return crt_dt;
	}

	public void setCrt_dt(Date crt_dt) {
		this.crt_dt = crt_dt;
	}
	
}
