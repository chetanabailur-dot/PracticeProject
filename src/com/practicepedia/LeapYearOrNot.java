package com.practicepedia;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int year=2009;
		
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();

		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if (year%400==0)
				{
					
					System.out.println(year+" is a Leap Year");
				}
				else 	
				{
					
				System.out.println(year+" is not a Leap Year");
				
				}
			
			}
			else 	
			{
			System.out.println(year+" is not a Leap Year");
			}
		
		}
		else 	
			{
			System.out.println(year+" is not a Leap Year");
			}
		

	}

}
