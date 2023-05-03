package com.java.basic;

import java.util.Scanner;

public class OddEvenNumSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	     
        int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;
        
        do
        {
            System.out.print("Enter the number ");
            number = scan.nextInt();
        
            if( number % 2 == 0)
            {
                evenSum += number;
            }
            else
            {
                oddSum += number;
            }
        
            System.out.print("Do you want to continue y/n? ");
            choice = scan.next().charAt(0);
            
        }
        while(choice=='y' || choice == 'Y');
        
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
	
        
	}

}
