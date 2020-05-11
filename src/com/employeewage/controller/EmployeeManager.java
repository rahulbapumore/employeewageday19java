package com.employeewage.controller;

import com.employeewage.model.Employee;
import java.util.*;
class EmployeeManager
{
  static List<Employee> emp = new ArrayList<>();
  public static void getEmp()
  {
        Employee empp;
        for(int i=0; i<10; i++)
        {
           empp = new  Employee();
	   empp.setId(i);
	   if((int)Math.round( Math.random()) == 0)
           	empp.setIsPresent(false);
	   else
		 empp.setIsPresent(true);
           if((int)Math.round( Math.random()) == 0)
	   	empp.setDoneParttime(false);
	   else
		empp.setDoneParttime(true);
           emp.add(empp);
        }

  }

  public static void calculateDailyWage()
  {
	for (Employee em : emp)
	{
	    if(em.getIsPresent() == true)
	    {
		if(em.getDoneParttime() == true)
		{
			em.setDailyWage(20*8 + 20*8);
		}
		else
		{
			em.setDailyWage(20*8);
		}
	    }
	}
  }

  public static void  calculateMonthlyWage()
  {
	for(Employee em : emp)
	{
	    if(em.getIsPresent() == true)
            {
                if(em.getDoneParttime() == true)
                {
                        em.setMonthlyWage((20*8 + 20*8)*20);
                }
                else
                {
                        em.setMonthlyWage(20*8*20);
                }
            }

	}
  }

  public static void printEmp()
  {
	for(Employee em : emp)
	{
		System.out.println("Employee Id = "+ em.getId() +
				   "Employee Daily Wage = "+ em.getDailyWage()+
				   "Employee Monthly Wage = "+ em.getMonthlyWage());

	}
  }
  public static void main(String... args)
  {
	getEmp();
	calculateDailyWage();
	calculateMonthlyWage();
	printEmp();

  }
}
