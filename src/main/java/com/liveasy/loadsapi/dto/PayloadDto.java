package com.liveasy.loadsapi.dto;

import com.liveasy.loadsapi.models.Facility;

public class PayloadDto {
	
	private Facility facility;
	
	private String productType;
	
	private String truckType;
	
	private String noOfTrucks;
	
	private String weight;
	
	private String comment;
	
	private String shipperId;
	
	private String date;

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
