package com.kn.SwitchCase;

import java.util.Scanner;

public class TrafficInstructor 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Colour of Traffic Light :");
		String str = sc.nextLine();
		switch(str)
		{
		case "red":
			System.out.println("Stop the Vehicle ");
			break;
		case "green":
			System.out.println("Move the Vehicle");
			break;
		case "yellow":
			System.out.println("Ready to go");
			break;
		default:
			System.out.println("Follow Traffic Rules");
			break;
		}
		sc.close();
		}
	}
