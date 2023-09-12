package com.kn.ForLoop;

import java.util.Scanner;

public class SumofSqauresofN 
{
	public static int SumofSquares(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i*i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		System.out.println("Sum of Sqaures upto a Number : "+SumofSquares(num));
		sc.close();
	}
}
