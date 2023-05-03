package com.java.basic;

public class PrintOddPositionElementsArray {

	public static void main(String[] args) {
		
int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        
        System.out.print("Elements present at Odd position: ");
        
        for(int i = 0; i < arr.length; i+=2) {
            System.out.print(arr[i] + " ");
        }	
	}

}
