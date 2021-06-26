package com.wiley.sortings;

import java.util.Arrays;

public class ShellSort {
	static void Shellsort(int []arr,int n){
		//used for calculation of the gap
		for(int gap=n/2;gap>=1;gap=gap/2) {
			//iterating through the j position in the array
			for(int j=gap;j<n;j++) {
				//we need to also compare i with before elemtn so we are using i inside j loop 
				for(int i=j-gap;i>=0;i=i-gap) {
					if(arr[i]<arr[j]) {
						//elements is sorted we can break from i loop;
						break;
					}else {
						int t=arr[i];
						arr[i]=arr[j];
						arr[j]=t;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int []arr= {2,7,9,5,23,29,15,19,31};
		int n=9;
		Shellsort(arr,n);

	}

}
