package com.karthik.SpringMVCDemo5.Model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Student {

	// @Size(min =5, max =10,message="Student name should be minimum of {min}
	// character and maximum of {max}")
	// now let us try to read the message from property file =ErrorMessage
	// also check changes done in dispatcher file.
	@NotBlank
	@Size(min = 7, max = 15) // used for property file example and bellow will
								// read message from property file
	@Pattern(regexp = "[^0-9]*")
	private String studentName;
	@NotNull
	@Min(value = 2222)
	@Max(value = 5555)
	private Long mobileNumber;
	@Past // date which is less than today also @future-date greater than today
	@NotNull
	private Date dateOfJoining;
	@NotEmpty
	private String studentHobby;
	private Address address;
	private List<String> courses;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getStudentHobby() {
		return studentHobby;
	}

	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}

}
