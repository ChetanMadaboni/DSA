package com.wiley.sortings;

import java.util.Scanner;
//6
//5 4 10 1 6 2

//BestCase->O(n)
//AvgCase->O(n^2)
//WorstCase->O(n^2)
public class InsertionSort {
	static void sort(int []arr,int n) {
		for(int i=1;i<n;i++) {
			int temp=arr[i];//4,10,1
			int j=i-1;//0,1,2
			while(j>=0 && temp<arr[j])//0>=0 && 4<5||1>=0 && 10<5,4||2>=0 && 1<10
			{
				arr[j+1]=arr[j];		//arr[1]=5;				//arr[3]=10,arr[2]=5,arr[1]=4
				--j;					//-1
			}
			arr[j+1]=temp;		//arr[0]=4;,arr[2]=10,arr[0]=1;
		}	//4,5,10,1,6,2||4,5,10,1,6,2||1,4,5,10,6,2
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
