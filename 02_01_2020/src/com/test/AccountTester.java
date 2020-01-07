package com.test;

import java.util.Scanner;

import com.example.Account;
import com.example.AccountType;

public class AccountTester
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Select type of account [0-4]");
int choice = sc.nextInt();
Account account = new Account();
Account account1;
switch(choice)
{
case 1 : account1 = Account.createAccount(AccountType.CREDITCARD, 1223);
account1.displayAccountDetails();
break;
case 2 : account1 = Account.createAccount(AccountType.LOAN, 146223);

break;
case 3 : account1 = Account.createAccount(AccountType.SAVINGS, 13223);
account1.displayAccountDetails();
break;
case 4 : account1 = Account.createAccount(AccountType.CURRENT, 184423);
account1.displayAccountDetails();

break;
default: System.out.println("Invalid Choice");
}
}

}
