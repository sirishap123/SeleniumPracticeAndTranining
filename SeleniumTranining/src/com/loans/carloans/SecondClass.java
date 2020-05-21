package com.loans.carloans;

public class SecondClass

{
	
int K = 20, L = 30, M ;
	
	public void Add()
	{
		M = K+L;
		System.out.println("Addition K & L is :" +M);
	
	}
	
	public void Sub() 
	{
		M = K-L;
		System.out.println("Subtraction K & L IS :"+M);
		
	}

	public static void main(String[] args) 
	{
		//System.out.println("Hello");//
		
		SecondClass obj= new SecondClass();
		
		obj .Add();
		obj.Sub(); 
	}


	

		


	}


