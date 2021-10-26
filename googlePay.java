package com.xworkz.polymorphism;

public class googlePay {

	public void billPayment(long cardNo,String name,double amount)
	{
		System.out.println("Credit card bill payement succesfull");
	}
	
	public void billPayment(long mobileNo,int amount)
	{
		System.out.println("Postpaid bill payement succesfull");
	}
	public void billPayment(long no,double amount)
	{
		System.out.println("Electricity bill payement succesfull");
	}
	
	public void billPayment(int no,int amount)
	{
		System.out.println("Water bill payement succesfull");
	}
}
