package com.kn.IfElseLadder;

import java.util.Scanner;

public class IdentifyingTheCharacter 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character : ");
		char ch = sc.next().charAt(0);
		if(ch=='a' || ch=='e' ||ch=='i' || ch=='o'||ch=='u')
		{
			System.out.println("lower case Vowel");
		}
		else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println("Upper case Vowel");
		}
		else if(ch=='b' || ch=='c' || ch=='d' || ch=='f' || ch=='g' || ch=='h' || ch=='j' || ch=='k' || ch=='l' || ch=='m' || ch=='n' || ch=='p' || ch=='q' || ch=='r' || ch=='s' || ch=='t' || ch=='v' || ch=='w' || ch=='x' || ch=='y' || ch=='z')
		{
			System.out.println("Lower case Consonant");
		}
		else if(ch=='B' || ch=='C' || ch=='D' || ch=='F' || ch=='G' || ch=='H' || ch=='J' || ch=='K' || ch=='L' || ch=='M' || ch=='N' || ch=='P' || ch=='Q' || ch=='R' || ch=='S' || ch=='T' || ch=='V' || ch=='W' || ch=='X' || ch=='Y' || ch=='Z')
		{
			System.out.println("Upper Case Consonant");
		}
		else
		{
			System.out.println("it is a Digit or a Special Character");
		}
		sc.close();
	}
}
