package com.kn.ForLoop;

import java.util.Scanner;

public class Palindrome 
{
	public static int IsPalindrome()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int rev=0,rem;
		int temp=num;
		for(;num>0;)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(temp==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		return temp;
	}
	public static void main(String[] args) {
		IsPalindrome();
	}
}
