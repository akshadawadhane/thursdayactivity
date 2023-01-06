package com.question3;


public class StringBuffers3 {

	public static void main(String[] args) {
		// illustrate append(),insert(),reverse(),replace()
			StringBuffer s=new StringBuffer("rohit ");
			
			   System.out.println(s);
			
			       System.out.println(s.append("somwanshi "));		
				
			           System.out.println(s.insert(16,"like coding"));		
			
			              System.out.println(s.reverse());		
			
			                 s.replace(0, 12, " java ");
			
			                    System.out.println("replace a string : " +s);
			
		}

	}