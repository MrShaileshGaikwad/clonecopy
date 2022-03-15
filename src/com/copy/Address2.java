package com.copy;

public class Address2{

	int pin;
	String city;
	String state;
	
	
	public Address2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address2(int pin, String city, String state) {
		super();
		this.pin = pin;
		this.city = city;
		this.state = state;
	}
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address2 [pin=" + pin + ", city=" + city + ", state=" + state + "]";
	}
	
	
}
