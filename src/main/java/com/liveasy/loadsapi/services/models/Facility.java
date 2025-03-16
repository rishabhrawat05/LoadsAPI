package com.liveasy.loadsapi.services.models;

import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "facility")
public class Facility {

	@Id
	@Column(name = "facilityId")
	private String facilityId = "facility:" + UUID.randomUUID();
	
	@Column(name = "loadingPoint")
	private String loadingPoint;
	
	@Column(name = "unloadingPoint")
	private String unloadingPoint;
	
	@Column(name = "loadingDate")
	private String loadingDate;
	
	@Column(name = "unloadingDate")
	private String unloadingDate;

	public String getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(String facilityId) {
		this.facilityId = facilityId;
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getLoadingDate() {
		return loadingDate;
	}

	public void setLoadingDate(String loadingDate) {
		this.loadingDate = loadingDate;
	}

	public String getUnloadingDate() {
		return unloadingDate;
	}

	public void setUnloadingDate(String unloadingDate) {
		this.unloadingDate = unloadingDate;
	}
	
	
}
