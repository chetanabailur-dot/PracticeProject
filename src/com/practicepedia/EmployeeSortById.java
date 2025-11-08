package com.practicepedia;

public class EmployeeSortById {

	public static final int id = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}


	
	class Employee{
		private String EmpName;
		private int EmpId;
		
		Employee(String EmpName, int EmpId)
		{
			this.EmpId=EmpId;
			this.EmpName=EmpName;
		}
		
		public String getName()
		{
			return EmpName;
		}
		
		public void setName(String name)
		{
			this.EmpName=EmpName;
		}
		
		public int getId()
		{
			return EmpId;
		}
		
		public void setId(int id)
		{
			this.EmpId=EmpId;
		}
	}

}
