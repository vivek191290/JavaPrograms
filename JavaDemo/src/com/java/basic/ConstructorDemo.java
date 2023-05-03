package com.java.basic;

public class ConstructorDemo {

	String color;
	   double price;
	   String brand;
	   
	   // Zero-arg constructor
	   ConstructorDemo()
	   {
	       System.out.println("In zero-arg const.");
	   }
	   
	   ConstructorDemo(String color,double price,String brand)
	   {
	       this.color = color;
	       this.price = price;
	       this.brand = brand;
	   }
	   
	   
	   void writing()
	   {
	       System.out.println("Writing......");
	   }
	   
	   public static void main(String[] args) {
		   ConstructorDemo p1 = new ConstructorDemo(); // Default constructor
	       System.out.println("Pen color is: "+p1.color);
	       p1.writing();
	   
	       
	       ConstructorDemo p2 = new ConstructorDemo("Black", 25.55, "Cello");
	       System.out.println(p2.color);
	       System.out.println(p2.price);
	       System.out.println(p2.brand);
	       
	       
	       // null
	       
	       /*
	        *                    | color = "black"
	        *            p2    ==>    | price = 25.55
	        *                    | brand = "Cello"
	        *
	        */
	       
	   
	   }

}
