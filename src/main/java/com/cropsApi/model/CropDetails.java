package com.cropsApi.model;

public class CropDetails {
	private String name;
	private String alias;
	private String veriety;
	private String duration;
	private String seedSelection;
	private String prepration;
	private String sowing;
	private String irigation;
	private String fertilizers;
	private String harvesting;
	private String diseases;
	private String prevention;
	
	
	public CropDetails(String name, String alias, String veriety, String duration, String seedSelection,
			String prepration, String sowing, String irigation, String fertilizers, String harvesting, String diseases,
			String prevention) {
		super();
		this.name = name;
		this.alias = alias;
		this.veriety = veriety;
		this.duration = duration;
		this.seedSelection = seedSelection;
		this.prepration = prepration;
		this.sowing = sowing;
		this.irigation = irigation;
		this.fertilizers = fertilizers;
		this.harvesting = harvesting;
		this.diseases = diseases;
		this.prevention = prevention;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getSeedSelection() {
		return seedSelection;
	}
	public void setSeedSelection(String seedSelection) {
		this.seedSelection = seedSelection;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getPrepration() {
		return prepration;
	}
	public void setPrepration(String prepration) {
		this.prepration = prepration;
	}
	public String getSowing() {
		return sowing;
	}
	public void setSowing(String sowing) {
		this.sowing = sowing;
	}
	public String getIrigation() {
		return irigation;
	}
	public void setIrigation(String irigation) {
		this.irigation = irigation;
	}
	public String getFertilizers() {
		return fertilizers;
	}
	public void setFertilizers(String fertilizers) {
		this.fertilizers = fertilizers;
	}
	public String getHarvesting() {
		return harvesting;
	}
	public void setHarvesting(String harvesting) {
		this.harvesting = harvesting;
	}
	public String getDiseases() {
		return diseases;
	}
	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}
	public String getPrevention() {
		return prevention;
	}
	public void setPrevention(String prevention) {
		this.prevention = prevention;
	}
	public String getVeriety() {
		return veriety;
	}
	public void setVeriety(String veriety) {
		this.veriety = veriety;
	}
	
	
}
