package com.wiley.stack;

import java.util.Iterator;
import java.util.Stack;

public class StackUsgCol {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);//can also use push
		st.push(4);
		st.push(5);
		System.out.println(st.isEmpty());
		System.out.println(st.peek());//top element;
		System.out.println(st.pop());//removing the element from stack;
		System.out.println(st.search(new Integer(9)));// if the element is not found it will return -1;
		Iterator it=st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}

	}

}
