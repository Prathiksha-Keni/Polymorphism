package com.xworkz.polymorphism;

public class PhonePayPayement extends OnlinePayment{

	@Override
	public void moneyTransfer() {
		super.moneyTransfer();//original method that is present in parent class
		System.out.println("Money transfered via rupay");//changing the implementation
	}
}
