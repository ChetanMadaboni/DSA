package com.wiley.sortings;

import java.util.Arrays;
import java.util.Scanner;
//Best,Avg,Worst->O(n+k);
//space->O(k);
//Stable aglo
public class CountingSort {
	static void Countsort(int []arr,int n,int k) {
		int sze=k+1;
		int carr[]=new int[sze];
		int r[]=new int[n];
		for(int i=0;i<n;i++) {
			++carr[arr[i]];
		}
		for(int i=1;i<sze;i++) {
			carr[i]=carr[i]+carr[i-1];
		}
		//System.out.println(Arrays.toString(carr));
		for(int i=n-1;i>=0;i--) {
			//System.out.println("s"+i);
			int t=--carr[arr[i]];
			
			r[t]=arr[i];
		}
		System.out.println(Arrays.toString(r));
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int []arr={4,2,2,8,3,3,1};
		Countsort(arr,7,8);
		
	}
}
