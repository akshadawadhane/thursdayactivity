package com.question1;


import java.util.Comparator;

public class ProductMain  implements Comparator<Product> {
public int compare(Product o1, Product o2) {
		
	Product p1 =(Product) o1;
	Product p2=(Product) o2;
	if(p1.price==p2.price)  // comparing price with product 1&2
		return 0;
	else if(p1.price>p2.price) return 1;
	else return -1;
	}

}