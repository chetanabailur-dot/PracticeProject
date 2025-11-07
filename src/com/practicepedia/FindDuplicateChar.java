package com.practicepedia;

public class FindDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Programming for Beginners";
		char[] ch=str.toCharArray();
		int count=0;
		String result="";

		for (int i=0; i<ch.length;i++)
		{
			count=0;
			if(ch[i]=='0')
				continue;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='0';	
				}
			}
			if(count>0)
			{
				result+=ch[i];
			}
		}
		System.out.println(result); 
		System.out.println("No of charcaters repeating: "+ result.length()); 
	}



}


