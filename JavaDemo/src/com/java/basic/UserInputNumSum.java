package com.java.basic;

import java.util.Scanner;

public class UserInputNumSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	     
        int number1, number2;
        char choice;
        
        do
        {
            System.out.print("Enter the first number ");
            number1 = scan.nextInt();
          
            System.out.print("Enter the second number ");
            number2 = scan.nextInt();
            
            int sum = number1 + number2;
            System.out.println("Sum of numbers: " + sum);
        
            System.out.print("Do you want to continue y/n? ");
            choice = scan.next().charAt(0);
            
            System.out.println();
            
        }while(choice=='y' || choice == 'Y');

	}

}
