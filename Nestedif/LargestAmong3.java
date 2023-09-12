package com.kn.Nestedif;

import java.util.Scanner;

public class LargestAmong3 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a==b && b==c && c==a)
		{
			System.out.println("Equal Numbers");
		}
		else {
			if(a>b && a>c)
			{
				System.out.println(a+"Largest Number");
			}
			else if(b>a && b>c)
			{
				System.out.println(b+" is the Largest Number");
			}
			else if(c>a && c>b)
			{
				System.out.println(c+" is the Largest Number");
			}
		}
		sc.close();
	}
}
