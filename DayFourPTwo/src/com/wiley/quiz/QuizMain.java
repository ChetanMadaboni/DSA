package com.wiley.quiz;

public class QuizMain {

	public static void main(String[] args) {
		Quiz q=new Quiz();
		Thread t1=new Thread(new QuestionJob(q));
		Thread t2=new Thread(new AnswerJob(q));
		t1.start();
		t2.start();
		

	}

}
