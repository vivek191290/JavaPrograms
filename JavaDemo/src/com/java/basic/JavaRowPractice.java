package com.java.basic;

import java.util.Scanner;

public class JavaRowPractice {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Welcome to arithmetic program");
		
		System.out.println("Enter a first number : " );
		int num1 =scan.nextInt();
		System.out.println("Enter a second number : " );
		int num2 =scan.nextInt();
		int sum;
		sum = num1 + num2;
		
		System.out.println("Sum of "+num1 +" and "+num2+ " "+ "is := "+sum);
		
		

	}

}
