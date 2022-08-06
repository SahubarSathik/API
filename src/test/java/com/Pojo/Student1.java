package com.Pojo;

import java.util.List;

public class Student1 {

	private String Department;
	private int year;
	private char section;
	private String classTeacher;
	private List<Details> studentDetails;

	public Student1(String department, int year, char section, String classTeacher, List<Details> studentDetails) {
		super();
		Department = department;
		this.year = year;
		this.section = section;
		this.classTeacher = classTeacher;
		this.studentDetails = studentDetails;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

	public String getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}

	public List<Details> getStudentDetails() {
		return studentDetails;
	}

	public void setStudentDetails(List<Details> studentDetails) {
		this.studentDetails = studentDetails;
	}

	
}
