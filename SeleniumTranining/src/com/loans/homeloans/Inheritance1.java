package com.loans.homeloans;

public class Inheritance1 extends Inheritance // IS A Relationship

{
	
	public void Siri() 
	{
		System.out.println("i am siri from Inhertiance1");
		
	}

	public static void main(String[] args) 
	
	{
		
		
	    Inheritance s = new Inheritance();  // Has Relationship
	    
	    s.Sirisha();
	    
		/*
		 * Inheritance1 i = new Inheritance1();
		 * 
		 * i.Siri();
		 */
	    
	    Inheritance obj = new Inheritance1();
	    
	    obj.Sirisha();

	}

}
