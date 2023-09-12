package com.kn.Nestedif;

import java.util.Scanner;

public class LoanEligibility 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Age : ");
		int age = sc.nextInt();
		System.out.print("Enter the Income : ");
		int income=sc.nextInt();
		if(age>=25)
		{
			if(income>20000)
			{
				System.out.println("Qualified");
			}
			else
			{
				System.out.println("Not Qualified");
			}
		}
		else
		{
			System.out.println("Not Qualified");
		}
		sc.close();
	}
}
