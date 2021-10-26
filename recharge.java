package com.xworkz.polymorphism;

public class recharge {

	public static void main(String[] args) {
		googlePay GooglePay = new googlePay();
		GooglePay.billPayment(9564575456L,1500);
		
		PhonePay phonepay = new PhonePay();
		phonepay.recharge(56562, 2000);
	}

}
