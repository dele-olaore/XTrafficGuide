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
public class Correspondent implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
    @GeneratedValue
	private Long id;
	@ManyToOne
	private Customer customer;
	private String notificationType; // opt-in/opt-out/traffic-update
	private String messageReceived;
	@Temporal(TemporalType.TIMESTAMP)
	private Date received_dt;
	
	private String messageSent;
	@Temporal(TemporalType.TIMESTAMP)
	private Date send_dt;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date crt_dt;
	
	public Correspondent()
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

	public String getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}

	public String getMessageReceived() {
		return messageReceived;
	}

	public void setMessageReceived(String messageReceived) {
		this.messageReceived = messageReceived;
	}

	public Date getReceived_dt() {
		return received_dt;
	}

	public void setReceived_dt(Date received_dt) {
		this.received_dt = received_dt;
	}

	public String getMessageSent() {
		return messageSent;
	}

	public void setMessageSent(String messageSent) {
		this.messageSent = messageSent;
	}

	public Date getSend_dt() {
		return send_dt;
	}

	public void setSend_dt(Date send_dt) {
		this.send_dt = send_dt;
	}

	public Date getCrt_dt() {
		return crt_dt;
	}

	public void setCrt_dt(Date crt_dt) {
		this.crt_dt = crt_dt;
	}
	
}
