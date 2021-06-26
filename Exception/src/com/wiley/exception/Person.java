package com.wiley.exception;

import java.util.HashMap;
import java.util.Map;

public class Person {
	static String name;
	static int age;
	Map<String,Integer> mp=new HashMap<String,Integer>();
	Person(String name,int age) throws NameAlreadyExists{
		if(mp.containsKey(name)) {
			throw new NameAlreadyExists("Name Already Exists Exception");
		}
		else if(age<18 ||age<0) {
			throw new AgeUncheckedException("Age Exception");
		}
	this.name=name;
	this.age=age;
	mp.put(name, new Integer(age));
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Person.name = name;
	}
	public static int getAge() {
		return age;
	}
	public static void setAge(int age) {
		Person.age = age;
	}
	
}
