package com.kn.simpleif;

import java.util.Scanner;

public class Adult 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age :");
		int age = sc.nextInt();
		if(age>20)
		{
			System.out.println("Adult");
		}
		sc.close();
	}
}
