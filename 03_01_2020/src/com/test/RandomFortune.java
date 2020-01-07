package com.test;
import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class RandomFortune {

	
	
	private String[] a = new String[5];
	
	{
		a[0] = "We can do different kind of processing on string";
		a[1] = "we can also write string array as";
		a[2] = "use when converted to String, their ";
		a[3] = "ok at different ways to initialize string";
		a[4] = "over string array using java for";
	}
	
	public void display() 
	{
		int rnd = new Random().nextInt(a.length);
		System.out.println(a[rnd]);
	}

	
	
	

}
