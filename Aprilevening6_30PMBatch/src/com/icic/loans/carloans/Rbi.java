package com.icic.loans.carloans;

public class Rbi implements Sbi 

{

	public static void main(String[] args) 
	{
		Rbi i = new Rbi();
		i.withdarwl();
		i.deposit();

	}

	@Override
	public void withdarwl() {
		System.out.println("oveeride withdarwl to RBI");
		
	}

	@Override
	public void deposit(){
		System.out.println("oveeride deposit to RBI");
		
	}

}
