package com.loans.homeloans;

public class DataTypes 

{
		byte b = 27 ;   
		
		short s = 32767 ;
		
		int i =  10 ;
		
		long l =  24 ;                          /// instance variables 
		
		float f = 12.33f ;
		
		double d = 23.4d ;
		
		boolean bb = true ;
		
		char c = 'a';
		
		String str = "sirisha";
		
		static 	String cname = "Raasinfotek"; // static variable

		public static void main(String[] args) 
		
		{
			int G = 60 ;
			System.out.println("G :" + G);   //local variable 
			
			DataTypes obj = new DataTypes();
			
			System.out.println("byte :"+obj.b);
			System.out.println("short :"+obj.s);
			System.out.println("int :"+obj.i);
			System.out.println("long :"+obj.l);
			
			System.out.println("float :"+obj.f);
			System.out.println("double :"+obj.d);
			
			System.out.println("boolean :"+obj.bb);
			System.out.println("char :"+obj.c);
			
			System.out.println("String :" +obj.str);
			
			System.out.println("String :"+cname);


	}

}
