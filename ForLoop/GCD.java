package com.kn.ForLoop;

import java.util.Scanner;

public class GCD 
{
	public static int Gcd(int a,int b)
	{
		int gcd=1;
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		return gcd;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Gcd of given numbers is "+Gcd(a,b));
		sc.close();
	}
}
