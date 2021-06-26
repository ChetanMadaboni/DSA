package com.wiley.sortings;

import java.util.Arrays;
import java.util.Scanner;
//best case,Avg->O(nk)
//worst case->O(nk);
//space->O(n+k);
public class RadixSort {
	
	static void Radixsort(int []arr,int n) {
		int max=maxEle(arr,n);
		for(int p=1;max/p>0;p=p*10) {
			Countsort(arr,n,p);
		}
		System.out.println(Arrays.toString(arr));
	}
	static void Countsort(int []arr,int n,int p) {
		int b[]=new int[n];
		int c[]=new int[n];
		for(int i=0;i<n;i++) {
			++c[((arr[i]/p)%10)];//main logic to know the digits at diff positions;
		}
		
		for(int i=1;i<n;i++) {
			c[i]=c[i]+c[i-1];
		}
		for(int i=n-1;i>=0;i--) {
			int l=--c[((arr[i]/p)%10)];
			b[l]=arr[i];
		}
		for(int i=0;i<n;i++) {
			arr[i]=b[i];
		}
		System.out.println("test"+Arrays.toString(arr));
	}
	
	static int maxEle(int []arr,int n){
        int me=0;
        for (int i=0;i<n;i++){
            if(arr[i]>me){
                me=arr[i];
            }
        }
        return me;
    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr={432,8,530,90,88,231,11,45,677,199};
		Radixsort(arr,arr.length);
		
	}

}
