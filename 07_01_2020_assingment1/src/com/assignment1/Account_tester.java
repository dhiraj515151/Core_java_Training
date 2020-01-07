package com.assignment1;
public class Account_tester {
public static void main(String[] args)
{
	Current cur = new Current(7676, "dhiraj", "6th cross", 5000);
	Savings save = new Savings(7676, "shiva", "7th cross", 7.0F);
	System.out.println(cur);
	System.out.println(save);
	System.out.println(cur.equals(save));
}


}