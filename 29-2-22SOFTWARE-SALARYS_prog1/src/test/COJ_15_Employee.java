/*Class COJ_15_Employee
Fields: 
id: int,
 name : String,
  basicSalary : double, 
  HRAPer : double,
  DAPer : double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer

Constructors:
default constructor: This constructor should initialize 
                  the instance variables with the proper default values
parameter constructor: Create with fields in the Order:
 ( int id, String name, double basicSalary, double HRAPer, double DAPer)
*/package test;

public class COJ_15_Employee 
{
   int id;
   String name;
   double HRAPer,DAPer,basicSalary;
  
   COJ_15_Employee()
   {
	   
	   
   }
   COJ_15_Employee(int id, String name, double basicSalary, double HRAPer, double DAPer )
   {
	   this.id=id;
	   this.name=name;
	   this.HRAPer=HRAPer;
	   this.DAPer=DAPer;
	   this.basicSalary=basicSalary;
   }   
   double a;
   public Double calculateGrossSalary() 
   {
	    a=basicSalary+HRAPer+DAPer;
	   
	   return a;
   }
}//end of class
