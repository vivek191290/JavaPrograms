package com.java.basic;

public class Car {

	String color; // null
	   boolean isAutomatic; // false
	   String brandName;

	   Car(String color, String brandName) {
	       this.color = color;
	       this.brandName = brandName;
	   }

	   Car() {

	   }

	   Car(String color, boolean isAutomatic) {
	       this.color = color;
	       this.isAutomatic = isAutomatic;
	   }

	   Car(String color) {
	       this.color = color;
	   }

	   Car(boolean isAutomatic) {
	       this.isAutomatic = isAutomatic;
	   }

	   public static void main(String[] args) {
	       Car car1 = new Car(); // Zero arg constructor
	       car1.color = "White";

	       // String color = "White";

	       System.out.println(car1.color);
	       System.out.println(car1.isAutomatic);

	       // String color = "Red";

	       Car car2 = new Car("Red", true);
	       System.out.println(car2.color);
	       System.out.println(car2.isAutomatic);

	       Car car3 = new Car("Grey");

	       Car car4 = new Car(true);
	   }

}
