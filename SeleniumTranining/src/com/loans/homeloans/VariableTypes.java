package com.loans.homeloans;

public class VariableTypes 

{

	int A = 20 ; // instance Variable 
	
	static String Rname = "Raasinfotek"; // Static Variable
	static VariableTypes Obj;
	public void M1() 
	{
		int B = 30 ; // local Variable
		System.out.println(B);
		
		System.out.println(Obj.A);
		System.out.println(VariableTypes.Rname);	
		
	}
	
	public static void M2() 
	{
	 Obj = new VariableTypes();
		System.out.println(Obj.A);
		System.out.println(VariableTypes.Rname);
		
	}
  
	public static void main(String[] args) 
	{
		 Obj = new VariableTypes();
		System.out.println(Obj.A);
		System.out.println(VariableTypes.Rname);

	}

}
