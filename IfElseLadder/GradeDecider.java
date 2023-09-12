package com.kn.IfElseLadder;

import java.util.Scanner;

public class GradeDecider {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Marks : ");
		int marks = sc.nextInt();
		if(marks>=90 && marks<100)
		{
			System.out.println("A");
		}
		else if(marks<=89 && marks>80)
		{
			System.out.println("B");
		}
		else if(marks>70 && marks<=79)
		{
			System.out.println("C");
		}
		else if(marks<=69 && marks>60)
		{
			System.out.println("D");
		}
		else if(marks<60)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Marks out of Range");
		}
			sc.close();
	}

}
