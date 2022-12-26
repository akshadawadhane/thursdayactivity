
//program for password generation using regex
package com.question1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PasswordGeneration {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the password");
		String Pass=sc.next();
		
		 String regex = "^(?=.*[0-9])"
               + "(?=.*[a-z])(?=.*[A-Z])"
               + "(?=.*[@#$%^&+=])"
               + "(?=\\S+$).{8,20}$";
       Pattern p=Pattern.compile(regex);
       Matcher m= p.matcher(Pass);
       boolean matchFound=m.find();
       
       if(matchFound)
      	 System.out.println("password is valid");
       else
      	 System.out.println("Invalid password Try Again----!");
	
	}

}