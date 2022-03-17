package com.noah.SpringMVC;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.noah.SpringMVC.validation.CourseCode;

public class Student {
	@NotNull(message="can't be null")//if don't follow the rule , the message will show out
	@Size(min=1,message="is required")//to show the default value in page
	private String firstName;
	
	@NotNull(message="can't be null")
	@Size(min=1,message="is required")
	private String lastName;
	
	@NotNull(message="can't be null")
	@Min(value=0,message="must be greater than 0")
	@Max(value=10,message="must be lower than 10")
	private Integer freeGames;
	
	//@CourseCode(value="TOPS",message="須以TOPS開頭")//自訂屬性 將蓋掉default值
	@CourseCode(value={"TOPS", "LUV"}, message="must start with TOPS or LUV")
	private String courseCode;
	
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	@NotNull(message="can't be null")
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="輸入5個英文/數字")
	private String postalCode;
	
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

	public Integer getFreeGames() {
		return freeGames;
	}

	public void setFreeGames(Integer freeGames) {
		this.freeGames = freeGames;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
}
