
package com.question1;

public class UsingComparable implements Comparable<UsingComparable> {

	
	int id;
	int age;
	String name;
	double Salary;
	public UsingComparable(int id, int age, String name, double salary) {
		super();
		this.id = id;            // invoke constructor
		this.age = age;
		this.name = name;
		Salary = salary;
	}
	public int compareTo(UsingComparable st){  
		if(age==st.age)  
		return 0;  
		else if(age>st.age)  
		return 1;  
		else  
		return -1;  
	}
}