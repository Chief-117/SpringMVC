package com.noah.SpringMVC.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

//	private String coursePrefix;
	private String[] coursePrefix;

	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.value();
	}

	@Override // mean the data entered by user
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {

//		boolean result;
//
//		if (theCode != null) {
//			result = theCode.startsWith(coursePrefix);
//		} else {
//			result = true;
//		}
//
//		return result;
//		--------------------------上方為判斷String-------------------------------
		boolean result = false;

		if (theCode != null) {

			//
			// loop thru course prefixes
			//
			// check to see if code matches any of the course prefixes
			//
			for (String tempPrefix : coursePrefix) {
				result = theCode.startsWith(tempPrefix);

				// if we found a match then break out of the loop
				if (result) {
					break;
				}
			}
		} else {
			result = true;
		}

		return result;
	}

}
