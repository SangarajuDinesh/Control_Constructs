package com.kn.ForLoop;

import java.util.Scanner;

public class EvenNumbersinRange 
{
	public static int Even(int num)
	{
		int even=0;
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				even=i;
				System.out.print(even+" ");
			}
		}
		return even;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		Even(num);
		sc.close();
	}
}
