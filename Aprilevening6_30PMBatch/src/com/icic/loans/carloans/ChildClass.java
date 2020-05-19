package com.icic.loans.carloans;

public class ChildClass extends FirstAbstract
{

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.M1();
		obj.M2();
	}
	
	public  void M1() {
		
		System.out.println("Abstarct M1 is a FirstAbstarct...");
	}

	@Override
	public void M2(){
		System.out.println("Abstarct M2 is a ChildClass...");
		
	}

}
