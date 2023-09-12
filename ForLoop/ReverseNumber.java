package com.kn.ForLoop;

import java.util.Scanner;

public class ReverseNumber
{
	public static int Reverse(int num) 
	{
		int rev=0,rem;
		for(;num>0;)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		System.out.println("Reverse of a Number is = "+Reverse(num));
		sc.close();
	}
}
