package com.question1;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableMain {

	public static void main(String[] args) {
		ArrayList<UsingComparable> al=new ArrayList<UsingComparable>();  
		
		al.add(new UsingComparable (101,19,"Rohit",10000) );
		al.add(new UsingComparable (102,29,"Pranit",60000) );
		al.add(new UsingComparable (103,21,"Suresh",30500) );
		al.add(new UsingComparable (104,25,"Aman",41000) );
		
		
		Collections.sort(al);  
		for(UsingComparable st:al){ 
		
			System.out.println(st.id+" "+st.age+" "+st.name+" "+st.Salary);
		
		
		

	}

}
}