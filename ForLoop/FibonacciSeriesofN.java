package com.kn.ForLoop;

import java.util.Scanner;

public class FibonacciSeriesofN 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range : ");
		int num = sc.nextInt();
		Fibonacci(num);
		sc.close();
	}
	public static void Fibonacci(int num)
	{
		int a=0,b=1;
		System.out.print(a+" "+b+" ");
		int sum=0;
		for(int i=2;i<=num;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(sum+" ");
		}
	}
}
