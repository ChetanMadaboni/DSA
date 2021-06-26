package com.wiley.bank;

import java.util.ArrayList;
import java.util.Scanner;
//1,2,3,4
public class Exam {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int []arr=new int[3];
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		for (int i=0;i<3;i++) {
			arr[i]=sc.nextInt();
		}
		while(sc.hasNextInt()) {
			arr1.add(sc.nextInt());
		}
		
		int res[]=new int[3];
		for(int j=0;j<3;j++) {
			for(int i=0;i<arr1.size();i++)
			{
				if(arr1.get(i)==arr[j]) {
					++res[j];
				}
				
			}
		}
			
		for(int i=0;i<3;i++) {
			System.out.println(arr[i]+"-"+res[i]);
		}
		sc.close();
	}
}
