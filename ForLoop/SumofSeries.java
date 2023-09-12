package com.kn.ForLoop;

import java.util.Scanner;

public class SumofSeries
{
	public static void FindSumSeries(int num)
	{
		double sum=0.0;
		for(double i=1;i<=num;i++)
		{
			sum=sum+1/i;
		}
		System.out.println("Sum of series = "+sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		FindSumSeries(num);
		sc.close();
	}
}
