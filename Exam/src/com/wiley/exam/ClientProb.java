package com.wiley.exam;

import java.util.Scanner;

class Client{
	private static int cid;
	private  static String cname,pnum;
	Client(int cid,String cname,String pnum){
		this.cid=cid;
		this.cname=cname;
		this.pnum=pnum;
	}
	public String getName() {
		return cname;
	}
	public int getCid() {
		return cid;
	}
	public String getPnum() {
		return pnum;
	}
}
class Agent extends Client{
	private static String aname;
	Agent(int cid,String cname,String pnum,String aname){
		super(cid,cname,pnum);
		this.aname=aname;
	}
	void disDetails(){
		System.out.println(getPnum());
		System.out.println(getName());
		System.out.println(getCid());
		System.out.println(aname);
	}
}
public class ClientProb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cid=sc.nextInt();
		String cname=sc.next();
		String pnum=sc.next();
		sc.nextLine();
		String aname=sc.nextLine();
		Agent a=new Agent(cid,cname,pnum,aname);
		a.disDetails();

	}

}
