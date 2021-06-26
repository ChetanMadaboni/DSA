package com.wiley.quiz;

public class AnswerJob implements Runnable {
	String []arr= {"chetan","19"};
	Quiz q;
	AnswerJob(Quiz q){
		this.q=q;
	}
	@Override
	public void run() {
	//	Scanner sc=new Scanner(System.in);
	//	sc=sc.next()
		for(String s:arr) {
			q.answer(s);
		}

	}

}
