package com.java.basic;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	       System.out.println("Enter the number: ");
	       
	       int num=scan.nextInt();
	       int count = 0; 
	       while(num!=0)
	       {
	           count++;
	           num=num/10;
	       }
	       
	       System.out.println("Number of digits: "+count);
	}

}
