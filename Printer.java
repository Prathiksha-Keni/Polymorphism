package com.xworkz.polymorphism;

public class Printer {

	public void print()
	{
		System.out.println("Printing the document in default settings");
	}
	
	public void print(String size)
	{
		System.out.println("Printing the document based on size "+size);
	}
	
	public void print(int startIndex,int lastIndex)
	{
		System.out.println("Printing the document from "+startIndex+" to "+lastIndex);
	}
}
