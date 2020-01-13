package com.password_validation;

public class UserMainCode {
	private String pw;

	public static  boolean checkPassword(String pw) 
	 {
		  	boolean result;
		  
	        int upper = 0, lower = 0, number = 0, special = 0; 
	        if(pw.length()>7)
	        {
	        	for(int i = 0; i < pw.length(); i++) 
	        
	        { 
	            char ch = pw.charAt(i); 
	            
	            if (ch >= 'A' && ch <= 'Z') 
	                upper++; 
	            	
	            else if (ch >= 'a' && ch <= 'z') 
	                lower++; 
	            
	            else if (ch >= '0' && ch <= '9') 
	                number++; 
	            
	            else
	                special++; 
	        } 
	        	
	        	System.out.println(upper+ " "+ lower+ " "+special);
	        }
	        
	        if(upper>0 && lower>0 && number>0 && special > 0)
	        {
	        	
	        	result = true;
	        	System.out.println("Valid Password.");
	        }
	        else
	        {
	        	result = false;
	        	System.out.println("Invalid Password.");
	        }
	        return result;

	}
}