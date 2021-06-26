package com.wiley.cd;

import java.util.Comparator;

public class SortByName implements Comparator<Cd> {

	public int compare(Cd a,Cd b) {
		return a.getSinger().compareTo(b.getSinger());
	}

	

}
