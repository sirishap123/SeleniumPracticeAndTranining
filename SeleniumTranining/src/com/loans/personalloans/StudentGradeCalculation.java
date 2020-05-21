package com.loans.personalloans;

import java.util.Scanner;

public class StudentGradeCalculation

{

	public static void main(String[] args) 
	{
		
		int [] mark = new int [5];
		
		float sum = 0 , avg ;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Markes Obtientd 5 Subjects");
		
		for(int i=0 ; i<mark.length; i++) 
		
		{
			mark[i] = scan.nextInt();
			
			sum = sum+mark[i];
			
		}
		
		System.out.println("sum of 5 subjects :" +sum);
		
		avg = sum /5 ;
		
		System.out.println("your Grade is");
		
		if(avg>90 )
		{
			System.out.print("A");
		}
			
			else if (avg >70 && avg <=80)
			{
				System.out.print("B");
			}
			else if (avg >60 && avg<=50)
			{
				System.out.print("C");
			}
			else 
			{
				System.out.print("D");
			}
	}

}
