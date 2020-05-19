package com.icic.loans.homeloans;

public class OverloadingDemo 

{
	
	public  void M1(float b) 
	{
		System.out.println(b);
		
	}
	
	public  void M1(int a) 
	{
		System.out.println(a);
		
	}
	
	public void M1(String name) 
	{
		System.out.println(name);
		
	}
	public static void main(String[] args) 
	{
		OverloadingDemo obj = new OverloadingDemo();
		obj.M1(23.45f);
		obj.M1(1744);
		obj.M1("Sirisha");
		

	}


}
