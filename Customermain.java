package com.question3;

public class Customermain {

	public static void main(String[] args) {
		Customer cr=new Customer();//details of 1 customer
		cr.createAccount();
		cr.setAmount();
		cr.getAmount();
		cr.withDrawAmount();
		System.out.println("enter the details of  2 customer is ");
		Customer cr2=new Customer();//details of 2 customer
		cr2.createAccount();
		cr2.setAmount();
		cr2.getAmount();
		cr2.withDrawAmount();


	}
}