package com.wiley.sortings;

import java.util.Scanner;
//BestCase->O(n^2);
//AvgCase->O(n^2);
//WorstCase->O(n^2);
//Space->O(1);
public class SelectionSort {
	public  static void sort(int []arr,int n) {
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
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