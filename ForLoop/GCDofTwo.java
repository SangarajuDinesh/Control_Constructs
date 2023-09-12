package com.kn.ForLoop;

import java.util.Scanner;

public class GCDofTwo 
{
	public static int GCD(int num1, int num2)
	{
		int rem=1,i=1;
		while(i>=1)
		{
			if(num1<num2)
			{
				if(num2%num1==0)
				{
					return num1;
				}
				else
				{
				rem=num2%num1;
				num1=rem;
				num2=num1;
			}
			}
			else if(num2<num1)
			{
				if(num1%num2==0)
				{
					return num2;
				}
				else
				{
				rem=num1%num2;
				num1=num2;
				num2=rem;
				}
			}
			i++;
		}
		return num1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 2 Numbers for GCD : ");
		int num1 = sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("GCD of Two Numbers is "+GCD(num1,num2));
		sc.close();
	}
}
