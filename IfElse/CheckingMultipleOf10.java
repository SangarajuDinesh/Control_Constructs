package com.kn.IfElse;

import java.util.Scanner;

public class CheckingMultipleOf10 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		if(num%10==0)
		{
			System.out.println("Multiple of 10");
		}
		else
		{
			System.out.println("Not a Multiple of 10");
		}
		sc.close();
	}
}
