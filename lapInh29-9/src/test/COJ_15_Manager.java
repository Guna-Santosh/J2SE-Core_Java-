/*Class COJ_15_Manager
Fields: 
id: int, 
name : String, 
basicSalary : double, 
HRAPer : double,
DAPer : double, 
projectAllowance: double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer + projectAllowance

Constructors:
default constructor: This constructor should initialize
           the instance variables with the proper default values
parameter constructor: Create with fields in the Order:
 ( int id, String name, double basicSalary, 
          double HRAPer, double DAPer, double projectAllowance)
*/package test;

public class COJ_15_Manager 
{
	 int id;
	 String name;
	 double HRAPer,DAPer,basicSalary,ProjectAllowance;
	 COJ_15_Manager()
	 {
		 
	 }//end of dconstructor
	 COJ_15_Manager(int id, String name, double basicSalary, double HRAPer, double DAPer,double ProjectAllowance)
	 {
		 this.id=id;
		   this.name=name;
		   this.HRAPer=HRAPer;
		   this.DAPer=DAPer;
		   this.basicSalary=basicSalary;
		   this.ProjectAllowance=ProjectAllowance;
	 }//end of pconstructor
	 Double b=0.0;
	 public  Double calculateGrossSalarym()
	 {
		  b=basicSalary+HRAPer+DAPer+ProjectAllowance;
		 return b;
	 }
	 
}//end of class
