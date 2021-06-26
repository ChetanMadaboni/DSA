package com.wiley.cd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CdMain {

	public static void main(String[] args) {
		ArrayList<Cd> arr=new ArrayList<Cd>();
		Scanner sc=new Scanner(System.in);
		int maximum=sc.nextInt();
		for(int i=0;i<maximum;i++) {
			System.out.println("Enter Singer Name: ");
			String name=sc.next();
			System.out.println("Enter Title Name: ");
			String title=sc.next();
			Cd cd=new Cd(title,name);
			arr.add(cd);
		}
		Collections.sort(arr,new SortByName());
		for(int i=0;i<maximum;i++) {
			System.out.println(arr.get(i).getSinger());
		}
			
			}

}
