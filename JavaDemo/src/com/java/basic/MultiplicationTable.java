package com.java.basic;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any positive integer: ");
        num = scan.nextInt();
                
        System.out.println("Multiplication Table of " + num);
        
        for(int i=1; i<=10; i++)
        {
            System.out.println(num +" x " + i + " = " + (num*i) );
        }
	}

}
