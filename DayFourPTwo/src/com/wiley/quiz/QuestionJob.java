package com.wiley.quiz;

public class QuestionJob implements Runnable {
	String []arr= {"Enter your favourite game","Enter your favourite"};
	Quiz q;
	QuestionJob(Quiz q){
		this.q=q;
	}
	@Override
	public void run() {
		for(String s:arr) {
			q.question(s);
		}

	}

}
