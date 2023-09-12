package com.kn.ForLoop;

import java.util.Scanner;

public class SumofDigits 
{
	public static int Sum(int num)
	{
		int rem,sum=0;
		for(int i=1;i<num;i++) {
			rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		System.out.println("Sum of Digits of a Number = "+Sum(num));
		sc.close();
	}
}
