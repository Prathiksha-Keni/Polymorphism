package com.xworkz.polymorphism;

public class Payment {

	public static void main(String[] args) {
		PhonePayPayement phonePayPayement = new PhonePayPayement();
		phonePayPayement.moneyTransfer();
		
		GooglePayPayement googlePayPayement = new GooglePayPayement();
		googlePayPayement.moneyTransfer();
	}

}
