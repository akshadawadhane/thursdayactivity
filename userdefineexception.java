//authur:akshada


package com.Question3;
import java.util.Scanner;

import javax.naming.InvalidNameException;
public class UserDefinedException extends Exception 

{
	void validateName(String name) throws InvalidNameException { 
		String[] names = { "ravi", "radhima", "suraj", "raghav"};
        boolean found= false;
        for (String n: names)
        {
            if (n.equalsIgnoreCase(name))
            {
                found = true;
                break;
            }
        }
        if (found)
        {
            System.out.println("the name is present");
        } 
        else 
        {
            throw new InvalidNameException("the name is not present");
        }
    }
	public static void main(String[] args) {
		 
		UserDefinedException scn=new UserDefinedException();
	        Scanner sc=new Scanner(System.in);
	        
	        System.out.println("Enter the Name:");
	        String name = sc.next();
	        try
	        {
	            scn.validateName(name);
	        }
	        catch(InvalidNameException e) 
	        {
	            System.out.println("Invalid Name " +e);
	        }
	}

	

}

