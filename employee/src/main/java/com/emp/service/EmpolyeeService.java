package com.emp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Exception.GloblalException;
import com.emp.entity.Address;
import com.emp.entity.Employee;

public class EmployeeService {

	private static List<Employee> employee =new ArrayList<Employee>();
	Scanner sc =new Scanner(System.in);
	public int lengthOfList;
	
	//method to add employee details in array list
	public void addEmployee(long empId,String name, Double salary,String city,String country) {
		Address address =new Address (city,country);
		employee.add(new Employee(empId,name,salary,address));
	}
	
	//for testing using builder annotation
	public void addEmp(Employee emp)
	{
		employee.add(emp);
	}
	
	//method to display all employee
	public void displayAllEmployee() {
		for(Employee emp:employee)
		{
			System.out.println("employee id"+emp.getEmpId());
			System.out.println("employee name"+emp.getName());
			System.out.println("employee salary"+emp.getSalary());
			System.out.println("employee address"+emp.getAddress());
			
		}
	}
	
	
	public Employee DisplayEmpById(int id) throws GloblalException
	{
		for(int i=0;i<employee.size();i++)
		{
			if(employee.get(i).getEmpId()==id)
			{
				//System.out.println("employee id"+((Employee) employee).getEmpId());
				//System.out.println("employee name"+employee.getName());
			//	System.out.println("employee salary"+employee.getSalary());
				//System.out.println("employee address"+employee.getAddress().getCity()+" "+emp.getAddress().getCountry());
				return employee.get(i);
			}
			else
			{
				throw new GloblalException("employee id not found");
			}
		}
		return null;
		
	}
	//update employee
	public Employee updateEmp(int index,Employee emp) {
		
		return employee.set(index, emp);
	}
	
	
	
	public Employee findId(int id)
	{
		Employee emp=null;
		for(int i=0;i<employee.size();i++)
		{
			if(employee.get(i).getEmpId()==id)
			{
				emp=employee.get(i);
			}
		}
		
		return emp;
		
	}
		
		public int lengthOfList()
		{
			return employee.size();
	
		}

			public void RemoveId(int id)
			{
				//Employee emp=null;
				for(int i=0;i<employee.size();i++)
				{
					if(employee.get(i).getEmpId()==id)
					{
						employee.remove(i);
					}
				}
			}
			
			public String RemoveAllemployee()
			{
				employee.clear();
				return "All employee details deleted successfully!!";
			}

			public double calculateYearlySalary(int id)
			{
				double yearlySalary=0.0;
				for(int i=0;i<employee.size();i++)
				{
					if(employee.get(i).getEmpId()==id)
					{
						yearlySalary= employee.get(i).getSalary()*12;
					}
				}
				return yearlySalary;
			}
			
			public double calculateAppraisal(int id)
			{
				double appraisal=0;
				for(int i=0;i<employee.size();i++)
				{
				if(employee.get(i).getSalary()<10000)
				{
					appraisal=1000;
				}
				else if((employee.get(i).getSalary()>10000) &&(employee.get(i).getSalary()<20000))
				{
					appraisal=2000;
				}
				else
				{
					appraisal=2500;
				}
				}
				return appraisal;
			}
		
	}