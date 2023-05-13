package com.java.basic;

import java.util.Scanner;

public class ColorArray {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
	       System.out.println("Enter the size: ");
	       
	int size = scanner.nextInt(); // 0 1 2

	// data-type array-name [] = new data-type[size];

	String colors [] = new String[size];

	// ["Red" | "Black" | "Pink"]
//	    0      |     1       |  2

	System.out.println("Enter "+size+" colors: ");

	for(int i=0; i<colors.length; i++)
	{
	   colors[i] = scanner.next();
	}

	for(int i=0; i<size; i++)
	{
	   System.out.println(colors[i]);
	}
	}

}
