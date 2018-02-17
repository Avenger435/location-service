package com.banu.api.location.model;

public class Location {

	private String id;
	private String cities;
	private String geoid;
	
	public Location() {
		
	}
	
	public Location(String cities, String geoid) {
		this.cities=cities;
		this.geoid=geoid;
	}

	public String getCities() {
		return cities;
	}

	public void setCities(String cities) {
		this.cities = cities;
	}

	public String getGeoid() {
		return geoid;
	}

	public void setGeoid(String geoid) {
		this.geoid = geoid;
	}
	
	
}

