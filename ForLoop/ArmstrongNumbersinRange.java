package com.kn.ForLoop;

import java.util.Scanner;

public class ArmstrongNumbersinRange 
{
	public static void Armstrong(int num)
	{
		int rem,sum=0;
		for(int i=1;i<=num;i++)
		{
			rem=i%10;
			sum=sum+rem*rem*rem;
			if(i==sum)
			{
			}
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		Armstrong(num);
		sc.close();
	}
}
