package com.kn.ForLoop;

import java.util.Scanner;

public class NumberTable 
{
	public static void PrintTable(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number for Table : ");
		int num = sc.nextInt();
		PrintTable(num);
		sc.close();
	}
}
