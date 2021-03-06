package com.wiley.sortings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BucketSort {
	static void Bucketsort(int []arr) {
		int x=max(arr);
		int c=0;
		int co=x;
		while(co>0) {
			c++;
			co=co/10;
		}
		
		ArrayList<Integer> []bucket=new ArrayList[10];
		for(int cu=1;(x/cu)>0;cu=cu*10) {
			
			for(int i=0;i<10;i++) {
				bucket[i]=new ArrayList<Integer>();
			}
			
			for(int i=0;i<arr.length;i++) {
				int pos=((arr[i]/cu)%10);
				bucket[pos].add(arr[i]);
			}
			
			for(int i=0;i<10;i++) {
				Collections.sort(bucket[i]);
			}
			int idx=0;
			for(int i=0;i<10;i++) {
				for(int j=0;j<bucket[i].size();j++) {
					arr[idx++]=bucket[i].get(j);
				}
			}
			//System.out.print(Arrays.toString(bucket));
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	static int max(int []arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		int []arr= {15,1,321,10,802,2,123,90,109,011};
		Bucketsort(arr);

	}

}
