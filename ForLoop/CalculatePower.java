package com.kn.ForLoop;

import java.util.Scanner;

public class CalculatePower 
{
	public static void FindPower(int base,int exponent)
	{
		int power=1;
		for(int i=1;i<=exponent;i++)
		{
			power=power*base;
		}
		System.out.println(base+" power "+exponent+" = "+power);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base : ");
		int base = sc.nextInt();
		System.out.print("Enter the Exponent : ");
		int exponent = sc.nextInt();
		FindPower(base,exponent);
		sc.close();
	}
}
