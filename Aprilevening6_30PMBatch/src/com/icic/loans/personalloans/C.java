package com.icic.loans.personalloans;

import com.icic.loans.homeloans.A;
import com.icic.loans.homeloans.B;

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
