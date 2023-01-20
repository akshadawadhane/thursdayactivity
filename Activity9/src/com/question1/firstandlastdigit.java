
package com.question1;

public class firstandlastdigit {
	  
	    public static void main(String args[])
	    {  
	        int number = 502356997;
	        int firstDigit = 0;
	        int lastDigit = 0;
	 //lastdigit number 
	        lastDigit = number%10;
	        System.out.println("the entre Last digit number: "+lastDigit);
	 //firstdigit number
	        while(number!=0) {
	            firstDigit = number%10;
	            number /= 10;
	        }
	        System.out.println("tne entre First digit number: "+firstDigit);
	    }
	}