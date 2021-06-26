package com.wiley.telephonedirectory;

public class Person {
	private String name;
	private long phonumber;
	public Person(String name,long phonenumber){
		this.name=name;
		this.phonumber=phonenumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhonumber() {
		return phonumber;
	}
	public void setPhonumber(long phonumber) {
		this.phonumber = phonumber;
	}
	
}
