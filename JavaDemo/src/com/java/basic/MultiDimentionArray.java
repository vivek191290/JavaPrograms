package com.java.basic;

import java.util.Scanner;

public class MultiDimentionArray {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	       System.out.println("Enter rows: ");
	       
	int rows = scanner.nextInt();

	    System.out.println("Enter cols: ");
	       
	int cols = scanner.nextInt();
	       
	   int matrix [][] = new int [rows][cols];
	   
	   System.out.println("Enter "+(rows * cols)+"numbers: ");
	       
	   for (int i = 0; i < rows; i++)
	   {
	       for (int j = 0; j < cols; j++)
	       {
	           matrix[i][j] = scanner.nextInt();
	       }
	   }
	   
	   
	   for (int i = 0; i < rows; i++)
	   {
	       for (int j = 0; j < cols; j++)
	       {
	           System.out.print(matrix[i][j]+" ");
	       }
	       System.out.println();
	   }
	   

	}

}
