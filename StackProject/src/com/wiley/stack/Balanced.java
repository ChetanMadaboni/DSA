package com.wiley.stack;

import java.util.Scanner;

public class Balanced {
	
	static char[]arr;
	static int top,n;

	static void push(char c) {
		if(top==n) {
			System.out.println("Overflow");
		}else {
			arr[++top]=c;
		}
	}
	
	static void pop() {
		if(top==-1) {
			System.out.println("Already Empty");
		}else {
			top--;
		}
	}
	
	boolean checkbalanced(String s,int n) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='{' || s.charAt(i)=='[' ||s.charAt(i)=='(') {
				push(s.charAt(i));
			}else {
				if(top==-1) {
				return false;	
				}else {
					if((arr[top]=='{' &&s.charAt(i)=='}') ||(arr[top]=='(' &&s.charAt(i)==')') ||(arr[top]=='[' &&s.charAt(i)==']') ) {
						pop();
					}else {
						return false;
					}
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		n=s.length();
		arr=new char[n];
		Balanced b=new Balanced();
		System.out.println(b.checkbalanced(s, n));
	}

}
