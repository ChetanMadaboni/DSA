package com.wiley.telephonedirectory;

import java.util.ArrayList;

public class Directory {
	ArrayList<Person> pr=new ArrayList<Person>();
	
	public void addPerson(Person p) {
		pr.add(p);
	}
	public Person getPerson(int index) {
		return pr.get(index);
	}
}
