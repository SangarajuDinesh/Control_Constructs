package com.kn.Nestedif;

import java.util.Scanner;

public class LeapYearWithCentury 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Year : ");
		int year = sc.nextInt();
		if(year%400==0 || (year%4==0 && year%100!=0))
		{
			System.out.println("leap year");
			if(year>0)
			{
				year/=100;
				System.out.println(year+" Century");
			}
		}
		else
		{
			System.out.println();
			System.out.println("Not a leap year");
		}
		sc.close();
	}
}
