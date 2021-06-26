package com.wiley.exception;

import java.util.Scanner;

public class InputMain {

	public static void main(String[] args) throws AgeUncheckedException{
		Scanner sc=new Scanner(System.in);
		System.out.println("please Enter number of Person details to be entered");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter Name:");
			String name=sc.next();
			System.out.println("Enter age:");
			int age=sc.nextInt();
			try {
				Person p=new Person(name,age);
			}catch(Exception e) {
				System.out.println(e);
			}
			
			
		}
		

	}

}
