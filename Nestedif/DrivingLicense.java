package com.kn.Nestedif;

import java.util.Scanner;

public class DrivingLicense 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Age : ");
		int age = sc.nextInt();
		System.out.print("Enter the Vision Score : ");
		double visionScore = sc.nextDouble();
		if(age>18)
		{
			if(visionScore>((double)20/40) || visionScore<(double)64/40)
			{
				System.out.println("Eligible for Driving License");
			}
			else
			{
				System.out.println("Not Eligible");
			}
		}
		else
		{
			System.out.println("Not Eligible");
		}
		sc.close();
	}
}
