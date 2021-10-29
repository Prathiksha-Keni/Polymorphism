package com.xworkz.polymorphism;

public class GooglePayPayement extends OnlinePayment {

	@Override
	public void moneyTransfer() {
		System.out.println("Money transfered via raserpay");
	}
}
