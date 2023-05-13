package com.java.basic;

public class SBI implements IATM {
	   public double getIntrest() {
	       return 5.5;
	   }
	public static void main(String[] args) {
		IATM atm = new HDFC();
	       System.out.println(atm.getIntrest());
	   

	}

}
