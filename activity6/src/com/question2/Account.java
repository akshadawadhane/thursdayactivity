
//example of user define exception
package com.question2;
import java.util.Scanner;
public class Account {
	
	 private int balance = 10000;
 int dp;
	 Scanner sc=new Scanner(System.in);
	    public int balance() {
	        return balance;
	    }
	    
	    
	 
	    public void withdraw() throws InsufficientBalanceException {
	    
	    	System.out.println("enter the amount you want to withdraw"); // withdraw amount
	    	int amount=sc.nextInt();
	    	
	    	
	        if (amount > balance) {
	            throw new InsufficientBalanceException(String.format(    // checking for exception
	                    "Current balance  is less than requested amount ",
	                    balance, amount));
	        }
	        balance = balance - amount;
	    }
	 
	    public void deposit() {
	    	System.out.println("enter the amount you want to deposit");
	    	int dp=sc.nextInt();
	    	balance=balance+dp;
	    	
	        if (dp <= 0) {
	            throw new IllegalArgumentException(String.format(
	                    "Invalid deposit amount %s",dp));}
	        
	        System.out.println(" the amount after deposited "+balance);
	        }
	    
	    
	    
	    
	public static void main(String[] args) throws InsufficientBalanceException {
		Account acc =new Account();
		System.out.println("Current balance : " + acc.balance());
       acc.withdraw();
     System.out.println("Current balance : " + acc.balance());
     acc.deposit();

		

	}

}
