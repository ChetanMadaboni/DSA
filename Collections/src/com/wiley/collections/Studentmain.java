package com.wiley.collections;

import java.util.*;
class SortByNameThenMarks implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.name.equals(s2.name)) {
			return s1.getMarks()-s2.getMarks();
		}
		return s1.name.compareTo(s2.name);
	}
	
}
public class Studentmain {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		Student s1=new Student(1,10,"chetan");
		Student s2=new Student(2,12,"koushik");
		Student s3=new Student(0,13,"amresh");
		Student s4=new Student(4,13,"chetan");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		Collections.sort(list,new SortByNameThenMarks());
		System.out.println(list.toString());
		
		//Collections.sort(list, new SortByNameThenMarks());
		//Collections.sort(list, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));
		//Collections.sort(list,new Comparator<Student>(){
//	public int compare(Student s1, Student s2) {
//		if(s1.name.equals(s2.name)) {
//			return s1.getMarks()-s2.getMarks();
//		}
//		return s1.name.compareTo(s2.name);
//	}
//	
//});
			
		for(Student s:list) {
			System.out.println(s.getName()+" "+s.getMarks());
		}
	}

}
