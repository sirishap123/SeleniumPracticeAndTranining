package com.loans.personalloans;

import java.util.Scanner;

public class Array1 

{
	
public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Array of Size : ");
		
		   int a = sc.nextInt();
		 
		   int [] c = new int[a];
		   int sum =0 ;
		 System.out.println("Enter array of Elemnts :");
		
		for(int i=0 ; i<c.length; i++)
		{
			 c[i] =  sc.nextInt();
			 sum = sum+c[i];
			System.out.println("a ["+i+"]"+c[i]);
			
		}
		
		System.out.println("Sum of the Arry is :" +sum );
   }
 } 

