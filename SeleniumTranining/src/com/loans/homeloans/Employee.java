package com.loans.homeloans;

public class Employee

{
		int eno;
		String ename;
		float sal;	
		
		public Employee()
		{
			System.out.println(" I am Default Constructor");
			System.out.println(this.eno);
			System.out.println(this.ename);
			System.out.println(this.sal);
		}
		
		public Employee(int eno)
		{
			this();
			this.eno = eno ;
			
			System.out.println(this.eno);
			System.out.println(this.ename);
			System.out.println(this.sal);
		}
		
		public Employee(int eno , String ename)
		{
			this(1744);
			this.eno = eno;
			this.ename = ename;
			System.out.println(this.eno);
			System.out.println(this.ename);
			System.out.println(this.sal);
			
		}
		

		public Employee(int eno, String ename, float sal) 
		{
			this(1744,"sirisha");
		    this. eno = eno ;
		    this. ename = ename ;
		    this. sal = sal;
		    
		    System.out.println(this.eno);
			System.out.println(this.ename);
			System.out.println(this.sal);
			
		}
		

		public static void main(String[] args) 
		{
			
			Employee e = new Employee(1744 , "sirisha", 23.45f);
	}

}
