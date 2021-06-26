package com.wiley.sortings;

import java.util.Scanner;
//BestCase->O(n);
//Avg->O(n^2);
//Worst->O(n^2);
//space->O(1);
public class Bubblesort {
	public static void sort(int []arr,int n) {
		for(int i=0;i<n-1;i++) {
			int flag=0;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
		}
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
