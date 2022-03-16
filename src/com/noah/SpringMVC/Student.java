package com.noah.SpringMVC;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	@NotNull(message="is null")//if don't follow the rule , the message will show out
	@Size(min=1,message="is required")//to show the default value in page
	private String firstName;
	@NotNull(message="is null")
	@Size(min=1,message="is required")
	private String lastName;

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
	
}
