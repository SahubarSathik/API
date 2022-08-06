package com.Pojo;

public class Details {
	private String name;
	private String fatherName;
	private String hobbie;
	private long mobileNo;
	private boolean reAdmission;
	public Details(String name, String fatherName, String hobbie, long mobileNo, boolean reAdmission) {
		super();
		this.name = name;
		this.fatherName = fatherName;
		this.hobbie = hobbie;
		this.mobileNo = mobileNo;
		this.reAdmission = reAdmission;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getHobbie() {
		return hobbie;
	}
	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public boolean isReAdmission() {
		return reAdmission;
	}
	public void setReAdmission(boolean reAdmission) {
		this.reAdmission = reAdmission;
	}
	
}
