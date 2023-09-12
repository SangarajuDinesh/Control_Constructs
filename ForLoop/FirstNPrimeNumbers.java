package com.kn.ForLoop;

import java.util.Scanner;

public class FirstNPrimeNumbers 
{
	public static void FirstNPrime()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		if(num<2)
		{
			System.out.println("Nothing");
		}
		for(int i=2;i<=num;i++)
		{
			int count=0;
			for(int j=1;j<=i+1;j++)
			{
				if(i%j==0)
				{
					count+=1;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
	public static void main(String[] args) {
		FirstNPrime();
	}
}
