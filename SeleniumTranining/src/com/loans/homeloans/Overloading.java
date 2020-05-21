package com.loans.homeloans;

public class Overloading

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
			Overloading obj = new Overloading();
			obj.M1(23.45f);
			obj.M1(1744);
			obj.M1("Sirisha");
			



	}

}
