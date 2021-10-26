package com.xworkz.polymorphism;

public class PhonePay {
	public void recharge(int UserNo,int amount)
	{
		System.out.println("DTH recharget succesfull");
	}
	
	public void recharge(long mobileNo,int amount)
	{
		System.out.println("Mobile recharge succesfull");
	}

}
