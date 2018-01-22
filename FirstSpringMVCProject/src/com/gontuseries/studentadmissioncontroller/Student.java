package com.gontuseries.studentadmissioncontroller;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class Student {
	@Pattern(regexp="[^0-9]*")
	@Size(min=2, max=30) 
	private String studentName;

   
	private String studentHobby;
   
	private ArrayList<String> studentSubjcts;
	
	private Long studentMobile;
	@Past(message = "Bhen de yaara , future wich jammea si??")
	private Date studentDOB;
	private Address studentAddress;
	
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	public ArrayList<String> getStudentSubjcts() {
		return studentSubjcts;
	}
	public void setStudentSubjcts(ArrayList<String> studentSubjcts) {
		this.studentSubjcts = studentSubjcts;
	}
	public Long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}

	
	
	


}
