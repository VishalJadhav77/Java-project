package com.Bank;

public class AdharCard {
	
	private String myName ;
	private String address ;
	private String dob ;
	private String adharNumber ;
	
	public AdharCard(String myName, String address, String dob, String adharNumber) {
		super();
		this.myName = myName;
		this.address = address;
		this.dob = dob;
		this.adharNumber = adharNumber;
	}
	
	public String getMyName() {
		return myName;
	}
	
	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getDob() {
		return dob;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getAdharNumber() {
		return adharNumber;
	}
	
	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}

	@Override
	public String toString() {
		return "AdharCard [myName=" + myName + ", address=" + address + ", dob=" + dob + ", adharNumber=" + adharNumber
				+ "]";
	}
	


}
