package com.ajy.extc;

public class MethodOverloading {
	
	public void m(Object o)
	{
		System.out.println("Object class");
		
	}
	public void m(String s)
	{
		System.out.println("String class");
	}
	public void m(StringBuffer s)
	{
		System.out.println("StringBuffer class");
	}
public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		obj.m(new Object());
		
		obj.m("Ajay");
		//obj.m(null);
}
}
