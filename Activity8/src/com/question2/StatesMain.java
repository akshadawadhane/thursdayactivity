
package com.question2;


import java.util.Iterator;

public class StatesMain {

	public static void main(String[] args) {
		States s=new States();
		s.addState("karnataka");
		s.addState("maharashtra");
		s.addState("telangana");
		s.addState("tamil nadu");
		s.addState("kerla");
		
		System.out.println(" retrive the details of states "+s.retriveState("kerla")); //checks the ststes is present or not

	}

}



