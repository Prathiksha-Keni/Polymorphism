package com.xworkz.polymorphism;

public class PrinterTest {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.print("A4");
		printer.print();
		printer.print(5, 10);
	}

}
