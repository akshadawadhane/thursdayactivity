package com.question7;

public class palindrome {

	public static void main(String[] args) {
		 String s1="radar abbaba ";
	        String[] array1=s1.split(" ");
	        int count=0;
	        
	        for(int i=0;i<array1.length;i++) {
	            
	            String s2="";
	            
	            for(int j=(array1[i].length())-1;j>=0;j--) {
	                
	                s2=s2+array1[i].charAt(j);
	            }
	            if(array1[i].equalsIgnoreCase(s2)) {
	                count++;
	            }
	        }
	        
	        System.out.println(count);        
	        
	        }
	    }