package com.java.basic;

public class EvenPositionElementsArray {

	public static void main(String[] args) {
int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.print("Elements present at even position: ");
        
        for(int i = 1; i < arr.length; i+=2) {
            System.out.print(arr[i] + " ");
        }

	
	}

}
