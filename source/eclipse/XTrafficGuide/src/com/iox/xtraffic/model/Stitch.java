package com.iox.xtraffic.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class Stitch implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
    @GeneratedValue
	private Long id;
	@ManyToOne
	private Shortcode shortcode;
	@Column(unique=true)
	private String stitchcode;
	private String name;
	private boolean status;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date crt_dt;
	
	public Stitch()
	{}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Shortcode getShortcode() {
		return shortcode;
	}

	public void setShortcode(Shortcode shortcode) {
		this.shortcode = shortcode;
	}

	public String getStitchcode() {
		return stitchcode;
	}

	public void setStitchcode(String stitchcode) {
		this.stitchcode = stitchcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Date getCrt_dt() {
		return crt_dt;
	}

	public void setCrt_dt(Date crt_dt) {
		this.crt_dt = crt_dt;
	}
	
}
