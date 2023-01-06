package com.question1;


import java.util.Comparator;

public class NameComparator implements Comparator<Product> {

	
	public int compare(Product o1, Product o2) {
		return o1.name.compareTo(o2.name); //comparing name with product p1 &p2
		
	}

}
