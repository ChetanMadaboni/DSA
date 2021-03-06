package com.wiley.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
enum days{
	Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
}
public class pque {

	public static void main(String[] args) {
		Queue<String> s=new PriorityQueue<String>();
		s.add("1");
		s.add("2");
		s.add("3");
		s.add("4");
		System.out.println(s.remove("5"));
		System.out.println(s.poll());//head element remove
		System.out.println(s.peek());//headelement display
		System.out.println(s.contains(new String("1")));
		
		Deque<String> s1=new ArrayDeque<>();
		s1.add("1");
		s1.add("2");
		s1.add("3");
		s1.add("4");
		System.out.println(s1.getFirst());
		System.out.println(s1.getLast());
		//System.out.println(s1.removeFirst());
		System.out.println(s1.pollFirst());
		System.out.println(s1.pollLast());
		System.out.println(s1.peekFirst());//()
		System.out.println(s1.peekLast());
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		Set set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Map.Entry mp=(Entry) it.next();
			System.out.println(mp.getKey()+" "+mp.getValue());
		}
		
		for(days d:days.values()) {
			System.out.println(d);
		}
		Set<days> s2=EnumSet.allOf(days.class);
		System.out.println(s2);
	}

}
