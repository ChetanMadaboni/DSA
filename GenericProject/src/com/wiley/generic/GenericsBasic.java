package com.wiley.generic;


class Container<T>{
	T value;
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	void method() {
		System.out.println(value);
	}
	
}
public class GenericsBasic {
	public static void main(String []args) {
		Container<Integer> obj=new Container<>();
		Container<String> obj1=new Container<>();
		obj.setValue(10);
		obj.method();
		obj1.setValue("hie");
		obj1.method();
		
	}
}
