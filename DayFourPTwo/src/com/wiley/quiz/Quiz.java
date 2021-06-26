package com.wiley.quiz;

import java.util.Scanner;

public class Quiz {
	static boolean flag=false;
	synchronized void question(String s) {
		while(flag!=false) {
			try {
				wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(s);
		flag=true;
		notify();
	}
	
	synchronized void answer(String s) {
		while(flag!=true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		Scanner sc=new Scanner(System.in);
		String ans=sc.next();
		if(ans.equals(s)) {
			flag=false;
			notify();
		}
		
	}
}
