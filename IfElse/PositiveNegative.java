package com.kn.IfElse;

import java.util.Scanner;

public class PositiveNegative 
{
	public static void PorN(int num)
	{
		if(num>0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Negative");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		PorN(num);
		sc.close();
	}
}
