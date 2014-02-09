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
public class ChargeEvent implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
    @GeneratedValue
	private Long id;
	@ManyToOne
	private Customer customer;
	private double rate;
	private String tnx_type; // Registration(Route or Stitch)/Renewal (Route or Stitch)/Instant Info
	private String tnx_code;
	private String tnx_desc;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date tnx_dt;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date crt_dt;
	
	public ChargeEvent()
	{}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getTnx_type() {
		return tnx_type;
	}

	public void setTnx_type(String tnx_type) {
		this.tnx_type = tnx_type;
	}

	public String getTnx_code() {
		return tnx_code;
	}

	public void setTnx_code(String tnx_code) {
		this.tnx_code = tnx_code;
	}

	public String getTnx_desc() {
		return tnx_desc;
	}

	public void setTnx_desc(String tnx_desc) {
		this.tnx_desc = tnx_desc;
	}

	public Date getTnx_dt() {
		return tnx_dt;
	}

	public void setTnx_dt(Date tnx_dt) {
		this.tnx_dt = tnx_dt;
	}

	public Date getCrt_dt() {
		return crt_dt;
	}

	public void setCrt_dt(Date crt_dt) {
		this.crt_dt = crt_dt;
	}
	
}
