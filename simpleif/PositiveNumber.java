package com.kn.simpleif;

import java.util.Scanner;

public class PositiveNumber 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		if(num>0)
		{
			System.out.println("Positive Number");
		}
		sc.close();
	}
}
