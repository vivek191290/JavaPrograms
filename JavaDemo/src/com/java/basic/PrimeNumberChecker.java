package com.java.basic;

public class PrimeNumberChecker {
	public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		int[] numbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        
        // iterate through the array and check if each number is prime
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPrime(num)) {
                System.out.println(num + " is prime");
            } else {
                System.out.println(num + " is not prime");
            }
        }
	}

}
