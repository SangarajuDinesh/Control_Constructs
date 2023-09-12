package com.kn.ForLoop;

import java.util.Scanner;

public class FactorialOfaGivenNumber 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of a Number : "+fact);
		sc.close();
	}
}
