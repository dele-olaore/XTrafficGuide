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
public class StitchRoute implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
    @GeneratedValue
    
	private Long id;
	@ManyToOne
	private Stitch stitch;
	@ManyToOne
	private Route route;
	private int rank;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date crt_dt;
	
	public StitchRoute()
	{}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Stitch getStitch() {
		return stitch;
	}

	public void setStitch(Stitch stitch) {
		this.stitch = stitch;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Date getCrt_dt() {
		return crt_dt;
	}

	public void setCrt_dt(Date crt_dt) {
		this.crt_dt = crt_dt;
	}
	
}
