package com.wiley.cd;

public class Cd {
	private String title,singerName;
	public Cd(String title, String singer) {
		this.title=title;
		singerName=singer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singerName;
	}
	public void setSinger(String singer) {
		singerName = singer;
	}
	
}
