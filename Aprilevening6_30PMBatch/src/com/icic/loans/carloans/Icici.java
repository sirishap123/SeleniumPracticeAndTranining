package com.icic.loans.carloans;

public class Icici implements Sbi

{

	public static void main(String[] args) {
		Icici i = new Icici();
		i.withdarwl();
		i.deposit();

	}

	@Override
	public void withdarwl() {
		System.out.println("oveeride witdarwl to ICICI");
		
	}

	@Override
	public void deposit() {
		System.out.println("oveeride deposit to ICICI");
	}

}
