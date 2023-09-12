package com.kn.simpleif;

import java.util.Scanner;

public class AdultMethod 
{
	public static void Adult(int age)
	{
		if(age>20)
		{
			System.out.println("Adult");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age :");
		int age = sc.nextInt();
		Adult(age);
		sc.close();
	}
	
}
