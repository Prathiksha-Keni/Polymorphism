package com.xworkz.polymorphism;

public class SignUp {

	public void Login(String email,String password)
	{
		System.out.println("Signed up through Email");
	}
	
	public void Login(long mbno,String password)
	{
		System.out.println("Signed up through Mobile");
	}
}
