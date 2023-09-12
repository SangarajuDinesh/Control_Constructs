package com.kn.Nestedif;

import java.util.Scanner;

public class RectangleSquare 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length : ");
		double length = sc.nextDouble();
		System.out.print("Enter the Width : ");
		double width = sc.nextDouble();
		if(length!=width)
		{
			System.out.println("Rectangle");
			if(length==width)
			{
				System.out.println("Square");
			}
		}
		sc.close();
	}
}
