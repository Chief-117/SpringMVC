package com.noah.SpringMVC;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

public class Teacher {

	private String firstName;

	private String lastName;

	private String country;
	
	private String favoriteFood;
	
	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	private LinkedHashMap<String, String> countryOption;

	public Teacher() {
		countryOption = new LinkedHashMap<>();
		countryOption.put("TW", "TAIWAN");
		countryOption.put("JP", "JAPAN");
		countryOption.put("CN", "CHINA");
		countryOption.put("US", "AMERAICA");
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LinkedHashMap<String, String> getCountryOption() {
		return countryOption;
	}

}
