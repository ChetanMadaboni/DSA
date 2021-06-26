package com.wiley.telephonedirectory;

import java.util.Scanner;

public class DirectoryMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Directory s=new Directory();
		System.out.println("Enter Maximum profiles");
		int maximum=sc.nextInt();
		for(int i=0;i<maximum;i++) {
			System.out.println("Enter Name:");
			String name=sc.next();
			System.out.println("Enter Phone Number:");
			Long phoneNumber=sc.nextLong();
			Person p=new Person(name,phoneNumber);
			s.addPerson(p);
			
		}
		for(int i=0;i<maximum;i++) {
			System.out.println("Name: "+s.getPerson(i).getName()+" Phone Number: "+s.getPerson(i).getPhonumber());
		}
	}

}
