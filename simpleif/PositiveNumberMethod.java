package com.kn.simpleif;

import java.util.Scanner;

public class PositiveNumberMethod {
	public static void positive(int num)
	{
		if(num>0)
		{
			System.out.println("Positive Number");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		positive(num);
		sc.close();
	}

}
