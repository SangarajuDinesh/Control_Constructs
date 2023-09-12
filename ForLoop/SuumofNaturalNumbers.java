package com.kn.ForLoop;

import java.util.Scanner;

public class SuumofNaturalNumbers 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range :");
		int range = sc.nextInt();
		int sum=0;
		for(int i=1;i<=range;i++)
		{
			sum=sum+i;
		}
		System.out.print("Sum of "+range+"Natural Numbers is = "+sum);
		sc.close();
	}
}
