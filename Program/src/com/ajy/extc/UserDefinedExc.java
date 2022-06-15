package com.ajy.extc;

import java.util.Scanner;

public class UserDefinedExc {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter the age");
		Scanner s=new Scanner (System.in);
		age=s.nextInt();
		
		if(age<18)
		{
			throw new CantVote("you cannot cast vote");
		}
		else
		{
			System.out.println("you can vote");
		}
	}

}
class CantVote extends RuntimeException
{
	public CantVote(String msg) {
		super(msg);
	}
}
