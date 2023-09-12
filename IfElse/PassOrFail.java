package com.kn.IfElse;

import java.util.Scanner;

public class PassOrFail 
{
	public static void PorF(int marks)
	{
		if(marks>50)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Marks : ");
		int marks = sc.nextInt();
		PorF(marks);
		sc.close();
	}
}
