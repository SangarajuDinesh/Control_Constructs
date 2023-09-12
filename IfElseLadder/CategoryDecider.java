package com.kn.IfElseLadder;

import java.util.Scanner;

public class CategoryDecider 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Age : ");
		int age = sc.nextInt();
		if(age<=12)
		{
			System.out.println("Child");
		}
		else if(age<=19 && age>13)
		{
			System.out.println("Teenager");
		}
		else if(age>19 && age<=59)
		{
			System.out.println("Adult");
		}
		else
		{
			System.out.println("Senior");
		}sc.close();
	}
}
