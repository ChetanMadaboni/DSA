package com.wiley.sortings;

import java.util.Scanner;
//bestcase->nlogn
//avgcase->nlong
//worstcase->nlogn
public class MergeSort {
	static void mergesort(int []arr, int n,int l,int h) {
		if(l<h) {
			int mid=(l+h)/2;
			mergesort(arr,n,l,mid);
			mergesort(arr,n,mid+1,h);
			merge(arr,l,mid,h);
		}
	}
	static void merge(int []arr,int l,int m,int h) {
		//first we need to make know the size of left and right array
		int lft=m-l+1;
		int rgt=h-m;
		//construction of arrays to store the require elements
		int lf[]=new int[lft];
		int rt[]=new int[rgt];
		for(int i=0;i<lft;i++) {
			//we are l+i because not every time array array does not start from index0
			lf[i]=arr[l+i];
		}
		for(int j=0;j<rgt;j++) {
			//we have to consider to consider elements from mid+1 so we have considered it as mid +1
			rt[j]=arr[m+1+j];
		}
		int i=0,j=0;
		int k=l;
		while(i<lft && j<rgt) {
			if(lf[i]<rt[j]) {
				arr[k]=lf[i];
				i++;
			}else {
				arr[k]=rt[j];
				j++;
			}
			k++;
		}
		while(i<lft) {
			arr[k]=lf[i];
			k++;
			i++;
		}
		while(j<rgt) {
			arr[k]=rt[j];
			j++;
			k++;
		}
		//return arr;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		mergesort(arr,n,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
