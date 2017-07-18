package com;

import java.util.ArrayList;

public class EmployeeDemo {
	
	public static void main (String[] args)
	{
		ArrayList<Employee> e = new ArrayList<Employee>();
		
		Employee e1= new Employee(1, "Amit", "Nanded");
		e.add(e1);
		Employee e2= new Employee(2, "Sunny", "Nanded");
		e.add(e2);
		Employee e3= new Employee(3, "Sudeep", "Nanded");
		e.add(e3);
		Employee e4= new Employee(5, "Amit", "Nanded");
		
		System.out.println(searchEmployee(e, e4));
		System.out.println(getEmployees(e, "Nanded"));
		
	}
	
	public static boolean searchEmployee(ArrayList<Employee> arrlist, Employee e)
	{
		if (arrlist.size() != 0)
		{
			if (e.getEmpId() != 0)
			{
				for (int i = 0; i< arrlist.size(); i++)
				{
					if (e.getEmpId() == arrlist.get(i).getEmpId())
						return true;
				}
			}
		}
		return false;
	}
	
	public static int getEmployees(ArrayList<Employee> arrlist, String city)
	{
		int count = 0;
		if (arrlist.size() != 0)
		{
			if (city != null)
			{
				for(int i = 0; i< arrlist.size(); i++)
				{
					if (city == arrlist.get(i).getCity())
						count++;
				}
				return count;
			}
		}
		return 0;
	}

}
