package com.ajy.extc;


public class AbstractDemo {

	public static void main(String[] args) {

		Scooty Activa=new Scooty();
			Activa.NoOfWheels();

	}

}
abstract class Vehicle   //partially implemented class
{
	public abstract void NoOfWheels();
	
	public abstract void m();


	
}

 abstract class Scooty extends Vehicle
{
	public void NoOfWheels()
	{
		System.out.println(2);
	}
}
 
 