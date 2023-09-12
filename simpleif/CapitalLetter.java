package com.kn.simpleif;

import java.util.Scanner;

public class CapitalLetter 
{
	public static void Capital(char ch)
	{
		if(ch=='A' || ch=='B' || ch=='C' || ch=='D' ||ch=='E' || ch=='F' || ch=='G' || ch=='H' || ch=='I' || ch=='J' || ch=='K' || ch=='L' || ch=='M' || ch=='N' || ch=='O' || ch=='P' || ch=='Q' || ch=='R' || ch=='S' || ch=='T' || ch=='U' || ch=='V' || ch=='W' || ch=='X' || ch=='Y' || ch=='Z')
		{
			System.out.println("Capital Letter");
		}
			
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		char ch = sc.next().charAt(0);
		Capital(ch);
		sc.close();
	}
}
