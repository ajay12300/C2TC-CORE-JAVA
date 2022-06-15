package com.ajy.extc;

public class Constructor {
	
	String name;
	int roll;
	
	Constructor(String name, int roll){
		
		this.name=name;
		this.roll=roll;
	}

	public static void main(String[] args)
	{
		Constructor s1=new Constructor("Ajay",20);
		Constructor s2=new Constructor("Rahul",30);
		
		System.out.println(s1.name+" "+s1.roll);
		System.out.println(s2.name+" "+s2.roll);
	}
	

}
