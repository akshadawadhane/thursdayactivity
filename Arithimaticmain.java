//author:Akshada


// code to display sum of 2 no
package com.question2;

public class ArithmeticMain {

	public static void main(String[] args) {
	Adder ar= new Adder();  //creating adder object
	ar.callAdd(23,67); //CallAdd method from arithematic


	System.out.print(ar.callAdd(105,32) + " " + ar.callAdd(10,3) + " "
		    + ar.callAdd(10,156) + "\n");


	}

}