package com.loans.homeloans;

public class EmployeeChild  extends Employee

{
		String Address ;
	     
		public EmployeeChild(String Address) 
		
		{
			super(1744 , "sirisha", 23.45f);
			
			this.Address = Address ;
			
			System.out.println(this.Address);
			
		}

		public static void main(String[] args) 
		
		{
			EmployeeChild e = new EmployeeChild("Hyderabad");


	}

}
