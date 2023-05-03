package com.java.basic;

public class LargestElementInArray {

	public static void main(String[] args) {
		int[] arr = {10, 5, 20, 45, 30};
        int max = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("The largest element in the array is: " + max);
	}

}
