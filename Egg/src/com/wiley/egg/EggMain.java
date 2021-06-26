package com.wiley.egg;

import java.util.Scanner;

public class EggMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		EggCalculate ec=new EggCalculate();
		ec.setCount(n);
		EggUnit e=ec.calculate();
		System.out.println(e.getGross()+" "+e.getDozen()+" "+e.getLeft());
	}

}
