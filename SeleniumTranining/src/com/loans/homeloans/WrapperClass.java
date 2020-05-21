package com.loans.homeloans;

public class WrapperClass 

{

	public static void main(String[] args) 
	
	{
		int A = 30;
		System.out.println("A :" +A);
		
		Integer i1 = new Integer(100);
		System.out.println(i1);
		
		Integer i2 = new Integer("123");
		System.out.println(i2);
		
		int i3;
		
		i3= i1+i2;
		System.out.println(i3);
		
		String S1 = "123";
		String S2 ="321";
		
		int S3;
		
		//S3 = S1+S2 ;
		S3=Integer.parseInt(S1) +Integer.parseInt(S2);
		System.out.println(S3);	

	}

}
