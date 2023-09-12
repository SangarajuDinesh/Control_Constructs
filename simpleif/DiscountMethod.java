package com.kn.simpleif;

import java.util.Scanner;

public class DiscountMethod 
{
	public static void Discount(int num)
	{
		if(num>100)
		{
			System.out.println("Discount is Applicable");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Purchase Amount in $ :");
		int num = sc.nextInt();
		Discount(num);
		sc.close();
	}
}
