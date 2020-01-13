package com.password_validation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		String pass = scan.nextLine();
		UserMainCode us  = new UserMainCode();
		us.checkPassword(pass);

	}

}
