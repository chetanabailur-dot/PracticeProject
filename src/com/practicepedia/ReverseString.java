package com.practicepedia;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This is a string";
		String rev="";
		
//   ------------------------------------------------------------	
//   --------------- Using StringBuilder ---------------
//   ------------------------------------------------------------	
//		StringBuilder strB=new StringBuilder("This is a string");
//		strB.reverse();
//		System.out.println(strB);
				
		
//   ------------------------------------------------------------	
//   --------------- Using String ---------------
//   ------------------------------------------------------------	
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
		}

}
