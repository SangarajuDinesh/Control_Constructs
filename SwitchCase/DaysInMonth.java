package com.kn.SwitchCase;

import java.util.Scanner;

public class DaysInMonth 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Month :");
		int Month = sc.nextInt();
		switch(Month)
		{
		case 1:
			System.out.println("january");
			break;
		case 3:
			System.out.println("March");
			break;
		case 5:
			System.out.println("May");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 10:
			System.out.println("october");
			break;
		case 12:
			System.out.println("December");
			break;
		case 2:
			System.out.println("February");
			break;
		case 4:
			System.out.println("April");
			break;
		case 6:
			System.out.println("June");
			break;
		case 9:
			System.out.println("September");
			break;
		case 11:
			System.out.println("November");
			break;
		default:
			System.out.println("invalid Month");
			break;
		}
		switch(Month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 days");
			break;
		case 2:
			System.out.println("28 Days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 Days");
			break;
		}
		sc.close();
	}
}

