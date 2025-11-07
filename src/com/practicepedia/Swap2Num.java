package com.practicepedia;

public class Swap2Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		System.out.println("Before");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
	a=a+b;  //30
	b=a-b;	//10
	a=a-b;	//20
	
	System.out.println("After");
	System.out.println("a: "+a);
	System.out.println("b: "+b);

	}

}
