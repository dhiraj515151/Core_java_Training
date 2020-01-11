package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;



public class driver {

	public static void main(String[] args) {
		Set<Student> st = new HashSet<Student>();
		st.add(new Student("huge","fizzy",1583,9));
		st.add(new Student("yuge","tizzy",58333,10));
		st.add(new Student("shiv","suzzy",2453,1));
		st.add(new Student("dhiraj","eggzy",2583,5));
		  
		TreeSet myTreeSet = new TreeSet();
		myTreeSet.addAll(st);
		Object[] arr = myTreeSet.toArray();
	
		
		
		
		
		
		
		
		
		
		//System.out.println(myTreeSet);
		
		/* Iterator<Student> itr=st.iterator();  
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 
	    } */
		

	}

}
