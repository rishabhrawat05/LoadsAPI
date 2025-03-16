package com.liveasy.loadsapi.services.models;


import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "payload")
public class Payload {
	
	@Id
	@Column(name = "loadId")
	private String loadId = "load:" + UUID.randomUUID();
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "facility")
	private Facility facility;
	
	@Column(name = "productType")
	private String productType;
	
	@Column(name = "truckType")
	private String truckType;
	
	@Column(name = "noOfTrucks")
	private String noOfTrucks;
	
	@Column(name = "weight")
	private String weight;
	
	@Column(name = "comment")
	private String comment;
	
	@Column(name = "shipperId")
	private String shipperId;
	
	@Column(name = "date")
	private String date;
	

	public String getLoadId() {
		return loadId;
	}

	public void setLoadId(String loadId) {
		this.loadId = loadId;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public String getNoOfTrucks() {
		return noOfTrucks;
	}

	public void setNoOfTrucks(String noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Facility getFacility() {
		return facility;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}

	public String getShipperId() {
		return shipperId;
	}

	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}
	
}
