package com.kn.IfElse;

import java.util.Scanner;

public class LeapYear 
{
	public static void Leap(int year) 
	{
		if((year%400==0)||(year%4==0 && year%100!=0))
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Year : ");
		int year = sc.nextInt();
		Leap(year);
		sc.close();
	}
}
