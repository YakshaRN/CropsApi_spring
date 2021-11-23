package com.cropsApi.model;

public class Crop {

	private int id;
	private String name;
	private String season;
	private String sowingTime;
	private String harvestingTime;
	private String duration;
	
		
	public Crop(int id, String name, String season, String sowingTime, String harvestingTime, String duration) {
		super();
		this.id = id;
		this.name = name;
		this.season = season;
		this.sowingTime = sowingTime;
		this.harvestingTime = harvestingTime;
		this.duration = duration;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getSowingTime() {
		return sowingTime;
	}
	public void setSowingTime(String sowingTime) {
		this.sowingTime = sowingTime;
	}
	public String getHarvestingTime() {
		return harvestingTime;
	}
	public void setHarvestingTime(String harvestingTime) {
		this.harvestingTime = harvestingTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
