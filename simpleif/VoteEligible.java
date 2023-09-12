package com.kn.simpleif;

import java.util.Scanner;

public class VoteEligible 
{
	public static int method(int num)
	{
		if(num>=18)
		{
			System.out.println("Eligible");
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int res=method(num);
		sc.close();
	}
}
