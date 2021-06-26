package com.wiley.Student;
import java.util.*;
public class Standard {
	Student s1=new Student("student1",15,20,30);
	Student s2=new Student("student2",5,10,15);
	Student s3=new Student("student3",12,24,36);
	Student s4=new Student("student4",14,28,42);
	Student s5=new Student("student5",20,40,60);
	Student s6=new Student("student6",16,32,48);
	Student s7=new Student("student7",10,70,30);
	Student s8=new Student("student8",60,69,80);
	Student []arr= {s1,s2,s3,s4,s5,s6,s7,s8};
	public void displayNameAndRollNo(){
		Arrays.sort(arr);
		for(Student s:arr) {
			System.out.println("Name: "+s.getStudName()+" RollNo: "+s.getRollNo());
		}
	}
	public void highestPercentage() {
		double percentages[]=new double[8];
		double maximum=0;
		int index=-1;
		for(int i=0;i<8;i++) {
			int totalMarks=arr[i].getMarksInEng()+arr[i].getMarksInMaths()+arr[i].getMarksInScience();
			percentages[i]=totalMarks/3.0;
			if(percentages[i]>maximum) {
				maximum=percentages[i];
				index=i;
			}
		}
		System.out.println("Student Name: "+arr[index].getStudName()+" Highest Percentage: "+arr[index].getRollNo());
	}
	public void highestInMathematics() {
		int []marks=new int[8];
		int maximum=0;
		int index=-19;
		for(int i=0;i<8;i++) {
			int mathsMarks=arr[i].getMarksInMaths();
			marks[i]=mathsMarks;
			if(marks[i]>maximum) {
				maximum=marks[i];
				index=i;
			}
		}
		System.out.println("Student Name: "+arr[index].getStudName()+" Highest Marks: "+arr[index].getRollNo());
	}
	
	
}
