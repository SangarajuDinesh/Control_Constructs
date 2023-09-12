package com.kn.simpleif;

import java.util.Scanner;

public class Discount 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Discount in $ :");
		int num = sc.nextInt();
		if(num>100)
		{
			System.out.println("Discount Applicable");
		}
		sc.close();
	}
}
