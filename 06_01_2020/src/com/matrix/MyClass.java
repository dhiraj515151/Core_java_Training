package com.matrix;

public class MyClass {
	
	
	public long add(int...a) //VARIABLE ARGUMENT
	{
		int result =0;
		for(int i:a)
		{
			result+=i;
		}
		return result;
	}
	
	public String add(String str,int a,int b)
	{
		return str+(a+b);
	}

}
