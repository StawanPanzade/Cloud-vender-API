package com.sp.model;

public class CloudVender {
	
	private String venderId;
	private String venderName;
	private String venderAddress;
	private String venderPhoneNumber;
	
	// 0- Parameter Constructor
	public CloudVender() {
		
	}
	
	// Parameterized Constructor Created
	public CloudVender(String venderId, String venderName, String venderAddress, String venderPhoneNumber) {
		this.venderId = venderId;
		this.venderName = venderName;
		this.venderAddress = venderAddress;
		this.venderPhoneNumber = venderPhoneNumber;
	}
	
	// Getter & Setter 
	public String getVenderId() {
		return venderId;
	}
	public void setVenderId(String venderId) {
		this.venderId = venderId;
	}
	public String getVenderName() {
		return venderName;
	}
	public void setVenderName(String venderName) {
		this.venderName = venderName;
	}
	public String getVenderAddress() {
		return venderAddress;
	}
	public void setVenderAddress(String venderAddress) {
		this.venderAddress = venderAddress;
	}
	public String getVenderPhoneNumber() {
		return venderPhoneNumber;
	}
	public void setVenderPhoneNumber(String venderPhoneNumber) {
		this.venderPhoneNumber = venderPhoneNumber;
	}
	
}
