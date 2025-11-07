package com.practicepedia;

import java.util.ArrayList;
import java.util.List;

public class MinMaxSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {30, 40, 20, 50, 10,60};
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i=0; i< num.length;i++)
		{
			list.add(num[i]);
		}
		
		System.out.println("Unsorted List:"+list);
		
		//Sorting
		
		list.sort(null);
		
		System.out.println("Sorted List:"+list);
		
		//Minimum
		
		System.out.println("Minimum:"+list.get(0));
		
		//Maximum
		
		System.out.println("Maximum:"+list.get(num.length-1));

	}

}
