
package com.question2;



import java.util.HashSet;
import java.util.Iterator;

public class States {

	HashSet<String> s1=new HashSet<>();
	
	void addState(String stateName)
	{
		s1.add(stateName);
	}
	
	String retriveState(String stateName)
	{
		Iterator it=s1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			}
if(s1.contains(stateName))
	return stateName;
else
return null ;
	}
	
	}