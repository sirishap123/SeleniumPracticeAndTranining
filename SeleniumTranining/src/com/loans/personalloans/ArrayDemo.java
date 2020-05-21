package com.loans.personalloans;

import java.util.Scanner;

public class ArrayDemo 

{
public static void main(String[] args) 
	
	{


	/*
	 * int []b = {30,40,50,60,70};
	 * 
	 * for(int i =0; i<b.length;i++) { System.out.println("b["+i+"]" +b[i]); }
	 * 
	 *
	 */
	
	/*
	 * int [] a = new int[4];
	 * 
	 * a[0]=10; a[1]=20; a[2]=30; a[3]=40;
	 * 
	 * for (int i = 0; i<a.length;i++) {
	 * 
	 * System.out.println(a[i]); }
	 */
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Array of Size : ");
	int b =sc.nextInt();
	
	int [] a = new int[b];
	int sum = 0;
	System.out.println("Enter The Array of Elemnts :");
	
	for(int i = 0 ; i<a.length;i++)
	{
		 a[i]= sc.nextInt();
		 sum = sum+a[i];
		System.out.println("a["+i+"]"+a[i] );
	}
	
	System.out.println("sum of Array is :" +sum);

   } 
 }
