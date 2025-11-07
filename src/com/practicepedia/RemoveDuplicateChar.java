package com.practicepedia;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ABCABCABC";
		String result="";
		
		for(int i=0;i<str.length();i++)
		{
			String c=""+str.charAt(i);    //char c=str.charAt(i);  converted to String


			if(result.contains(c))
			{
				continue;
			}
			else
			{
				result+=c;
			}
		}
		System.out.println(result);

	}

}
