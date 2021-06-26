package com.wiley.sortings;

import java.util.Scanner;
//10 15 1 2 9 16 11

//
public class QuickSort {
		static void Quicksort(int[] arr,int n,int l,int h) {
			if(l<h) {
				int mid=Partition(arr,n,l,h);
				Quicksort(arr,n,l,mid-1);
				Quicksort(arr,n,mid+1,h);
			}
		}
		static int Partition(int[] arr, int n,int l,int h) {
			int pivot=arr[l];
			int i=l;//(start)
			int j=h;//(end)
			while(i<j) {
				while(arr[i]<=pivot && i<h) {
					i++;
				}
			while(arr[j]>pivot && j>l) {
				j--;
			}
			//swap the internal elements
				if(i<j) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			//swap the pivot with end element
			int tmp=arr[l];
			arr[l]=arr[j];
			arr[j]=tmp;
			return j;
		}
		public static void main(String []args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int []arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			Quicksort(arr,n,0,n-1);
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
		}
}
