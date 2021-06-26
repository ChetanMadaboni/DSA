package com.wiley.sortings;

public class MergeTest {
	static void MergeSort(int []arr,int n,int l,int h) {
		if(l<h) {
			int mid=(l+h)/2;
			MergeSort(arr,n,l,mid);
			MergeSort(arr,n,mid+1,h);
			Merge(arr,l,mid,h);
		}
	}
	static void Merge(int []arr,int l,int m,int h) {
		//deteminig the size of left array;
		int lft=m-l+1;
		//detemining the ssize of right array;
		int rgt=h-m;
		int []lt=new int[lft];
		int []rt=new int[rgt];
		for(int i=0;i<lft;i++) {
			lt[i]=arr[l+i];
		}
		for(int j=0;j<rgt;j++) {
			rt[j]=arr[m+j+1];
		}
		int i=0,j=0;
		int k=l;//mistake
		while(i<lft &&j<rgt) {
			if(lt[i]<rt[j]) {
				arr[k]=lt[i];
				++i;
			}else {
				arr[k]=rt[j];
				++j;
			}
			++k;
		}
		while(i<lft) {
			arr[k]=lt[i];
			++i;
			++k;
		}
		while(j<rgt) {
			arr[k]=rt[j];
			++j;
			++k;
		}
	} 
	public static void main(String []args) {
	int []arr= {15,5,24,8,1,3,16,10,20};	
	int n=9;
	int l=0;
	int h=n-1;
	MergeSort(arr,n,l,h);
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
	}
}
