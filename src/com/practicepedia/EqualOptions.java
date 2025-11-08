package com.practicepedia;

public class EqualOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=10;
		int num2=10;
		
		String str1="hello";
		String str2="hello";
		
		String str3=new String("hello");
		String str4=new String("hello");
		
		if(str1==str2)
		{
			System.out.println("str1 is equal to str2");
		}
		else
			System.out.println("str1 is not equal to str2");
		
		if(num1==num2)
		{
			System.out.println("num1 is equal to num2");
		}
		else
			System.out.println("num1 is not equal to num2");
		
		if(str3==(str4))
		{
			System.out.println("str3 is equal to str4");   // 2 diff objects diff reference
		}
		else
			System.out.println("str3 is not equal to str4");
		
		if(str1.equals(str2))
		{
			System.out.println("str1 is equal to str2");
		}
		else
			System.out.println("str1 is not equal to str2");
			
		
		if(str3.equals(str4))
		{
			System.out.println("str3 is equal to str4");
		}
		else
			System.out.println("str3 is not equal to str4");
			
	

	}

}
