package com.wiley.Student;

public class Student implements Comparable<Student>{
	
	private static int RollNo, MarksInEng, MarksInMaths,MarksInScience; 
	private String  StudName;
	public Student(String studName, int marksInEng, int marksInMaths, int marksInScience) {
		super();
		StudName = studName;
		MarksInEng = marksInEng;
		MarksInMaths = marksInMaths;
		MarksInScience = marksInScience;
	}

	public int getRollNo() {
		return RollNo;
		
	}

	public void setRollNo() {
		int n=++RollNo;
		RollNo=n;
	}

	public String getStudName() {
		return StudName;
	}

	public void setStudName(String studName) {
		StudName = studName;
	}

	public int getMarksInEng() {
		return MarksInEng;
	}

	public void setMarksInEng(int marksInEng) {
		MarksInEng = marksInEng;
	}

	public int getMarksInMaths() {
		return MarksInMaths;
	}

	public void setMarksInMaths(int marksInMaths) {
		MarksInMaths = marksInMaths;
	}

	public int getMarksInScience() {
		return MarksInScience;
	}

	public void setMarksInScience(int marksInScience) {
		MarksInScience = marksInScience;
	}

	@Override
	public int compareTo(Student o) {
		int compareStudent=((Student)o).getRollNo();
		return RollNo-compareStudent;
	}

	
	
}
