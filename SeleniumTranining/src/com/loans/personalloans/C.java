package com.loans.personalloans;

import com.loans.homeloans.A;
import com.loans.homeloans.B;

public class C extends A 
{
	
	public void M3() {
		
		System.out.println("this name is M3");
	}

	public static void main(String[] args) {
		
		A a =new A();  
		 a.M1();
		 
		 B i = new B();
		 i.M2();
		
		C c = new C();
		c.M3();
	}


}
