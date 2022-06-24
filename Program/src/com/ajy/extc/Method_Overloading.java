package com.ajy.extc;

public class Method_Overloading {
	
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
		
		Method_Overloading obj=new Method_Overloading();
		obj.m(new Object());
		
		obj.m("Ajay");
		//obj.m(null);
}
}
