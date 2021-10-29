package com.xworkz.polymorphism;

public class TvTest {

	public static void main(String[] args) {
		PortableTv portableTv = new PortableTv();
		portableTv.connection();
		SmartTv smartTv = new SmartTv();
		smartTv.connection();
		LcdTv lcdTv = new LcdTv();
		lcdTv.connection();

	}

}
