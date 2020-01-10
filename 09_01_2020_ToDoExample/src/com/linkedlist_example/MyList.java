package com.linkedlist_example;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class MyList {
	private LinkedList<String> list = new LinkedList<String>();
	
	public void getSortedList()
	{
		list.add("Mumbai");
		list.add("Kanpur");
		list.add("Banglore");
		list.add("Goregaon");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
	

}
