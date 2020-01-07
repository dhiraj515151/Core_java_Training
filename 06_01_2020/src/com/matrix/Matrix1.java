package com.matrix;

import java.util.Scanner;

public class Matrix1 {
	
	int a , b ,c , d, m , n;
	int [][] a1 = new int[a][b];
	int[][] a2 = new int[c][d];
	int[][] sum = new int[m][n];
	public void matrix_create()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the rows of first matrix: ");
		a = scan.nextInt();
		System.out.println("enter the columns of first matrix: ");
		b = scan.nextInt();
		System.out.println("enter the rows of secodn matrix: ");
		c = scan.nextInt();
		System.out.println("enter the columns of second matrix: ");
		d = scan.nextInt();
		
	}
	
}
