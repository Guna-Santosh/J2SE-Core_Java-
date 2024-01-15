/*Que-2)
--------------
An organization needs a program to calculate 
how much to pay their hourly employees.
 The department of Labor requires that employees 
 get paid time and a half for any hours over 40 that 
 they work in a single week. For example, 
 if an employee works 45 hours, 
 they get 5 hours of overtime, 
 at 1.5 times their base pay. 
 The State of Massachusetts requires that hourly employees
  be paid at least $8.00 an hour. 
  Organization requires that an employee 
  not to work more than 60 hours in a week.

1. An employee gets paid (hours worked) × (base pay),
                   for each hour up to 40 hours.
2. For every hour over 40, they get overtime = (base pay) × 1.5.
3. The base pay must not be less than the minimum wage 
    ($8.00 an hour).
4. An employee should not work more than 60 hours in a week.

To implement above application a class Employee is given to you
 with all requirements.

class Employee 
	String name;
	int id;
	int hoursWorked;
	double basePay;

	// Define no-args Constructor and parameterized constructor 
            with all fields 

Now the task for you is to define a class "DayPay" 
             with following specifications.

Methods:
 1. Name: calculateSalary
    Arguments: Employee
    ReturnType: double
    Access Specifiers: static private
    
    Note: This method should calculate the salary based 
           on employee working hours and perform any of the below
    1. return base pay for every hour employee work.
    2. reurn base pay and half for every hour over 40 hours per week.
    3. return -1 if working hours is negative or more than 40 hours.
    4. return 0 if the employee wage is less than $8.0.
    
    Input:(name, id, hoursWorked, basePay):
        Employee: "John", 123, 50, 17 
    Output:
        935.0 (Return value) 
    
    Input:
        Employee: "John", 123, 50, 7
    Output:
        0.0 (Return value)
        
 2. Name: displayEmployeeDetails
    Arguments: Employee
    ReturnType: String
    Access Specifiers: static public
    
    Note: This method should return a string value
     in the below format
    Input:(name, id, hoursWorked, basePay):
        Employee: "John", 123, 50, 17 
    Output:
        Employee [Name: John, id: 123, Base Pay: 17.0, 
        No. of hours worked: 50, Payed: 935.0]
    
    If employee wage is less than $8.0 or 
    working hours is negative or  
    more than 60 hours in a week 
    return "Employee cannot exist with given information".
    
    Given a main class to test your code.
*/
package test;

public class Employee 
{
	String name;
	int id;
	int hoursWorked;
	double basePay;
	Employee(){}
	Employee(String name,int id,int hoursWorked,double basePay )
	{
		this.name=name;
		this.id=id;
		this.hoursWorked=hoursWorked;
		this.basePay=basePay;
		
	}
	@SuppressWarnings("unused")
	static private double calculateSalary(Employee e) 
	{//1. return base pay for every hour employee work.
		if(e.hoursWorked>40)
		
		
		
		
		if(e.hoursWorked<0||e.hoursWorked>40)
		return -1;
		
		return 0;
	}
	
	
	
}//end of class
