package com.karthik.SpringMVCDemo5.CustValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.hibernate.validator.ap.checks.ConstraintValidatorCheck;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {
	private String hobbies;
	@Override
	public void initialize(IsValidHobby isValidHobby) {
		// TODO Auto-generated method stub
		hobbies=isValidHobby.IsValidHobbies();
	}

	@Override
	public boolean isValid(String studenthobby, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		if (studenthobby == null) {
			return false;
		}
		if (studenthobby.matches(hobbies)) {
			return true;
		} else
			return false;
	}

}
