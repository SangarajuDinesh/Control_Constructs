package com.kn.IfElse;

import java.util.Scanner;

public class SeniorCitizenDiscount 
{
	public static void Senior(int age)
	{
		if(age>=55)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age : ");
		int age = sc.nextInt();
		Senior(age);
		sc.close();
	}
}
