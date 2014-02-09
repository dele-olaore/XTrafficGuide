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
public class TrafficReport implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
    @GeneratedValue
	private Long id;
	@ManyToOne
	private Route route;
	private String message;
	private String trafficStatus; // LOW/MEDIUM/HIGH/NO_GO_AREA
	@Temporal(TemporalType.TIMESTAMP)
	private Date update_dt;
	
	@ManyToOne
	private User reportedBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date crt_dt;
	
	public TrafficReport()
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTrafficStatus() {
		return trafficStatus;
	}

	public void setTrafficStatus(String trafficStatus) {
		this.trafficStatus = trafficStatus;
	}

	public Date getUpdate_dt() {
		return update_dt;
	}

	public void setUpdate_dt(Date update_dt) {
		this.update_dt = update_dt;
	}

	public User getReportedBy() {
		return reportedBy;
	}

	public void setReportedBy(User reportedBy) {
		this.reportedBy = reportedBy;
	}

	public Date getCrt_dt() {
		return crt_dt;
	}

	public void setCrt_dt(Date crt_dt) {
		this.crt_dt = crt_dt;
	}
	
}
