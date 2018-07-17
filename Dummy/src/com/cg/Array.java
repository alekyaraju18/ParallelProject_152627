package com.cg;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args)
	{int n;
	int s = 0;
	int p = 1;

	System.out.println("Enter the size of array");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int a[]=new int[n];

		System.out.println("Enter all the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n/2;i++)
		{
			s=s+a[i];
		}
		int m=n/2;
		for(int i=m+1;i<n;i++)
		{	
			p=p*a[i];
		}
		System.out.println(s);
		System.out.println(p);
		int result=s+p;
		System.out.println(result);
		
		
		
	}
}