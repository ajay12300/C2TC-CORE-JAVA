package com.ajy.extc;

public class ConstructorDemo {
	
	String name;
	int roll;
	
	ConstructorDemo(String name, int roll){
		
		this.name=name;
		this.roll=roll;
	}

	public static void main(String[] args)
	{
		ConstructorDemo s1=new ConstructorDemo("Ajay",20);
		ConstructorDemo s2=new ConstructorDemo("Rahul",30);
		
		System.out.println(s1.name+" "+s1.roll);
		System.out.println(s2.name+" "+s2.roll);
	}
	

}
