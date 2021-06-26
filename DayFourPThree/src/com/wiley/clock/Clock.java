package com.wiley.clock;

public class Clock{
	private static int flag=0; 
	 synchronized void Tick(int i) {
		 if(flag!=0) {
			 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 System.out.print("Tick-"+i);
		 flag=1;
		 notifyAll();
	 }
	 synchronized void Tack(int i) {
		 if(flag!=1) {
			 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 System.out.print("Tack-"+i);
		 flag=2;
		 notifyAll();
	 }
	 
	 synchronized void Tock(int i) {
		 if(flag!=2) {
			 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 System.out.println("Tock-"+i);
		 flag=0;
		 notifyAll();
	 }
	
}
