/*Class COJ_15_Sourcing
Fields: 
id: int, 
name : String, 
basicSalary : double, 
HRAPer : double,
DAPer : double, 
enrollmentTarget: int, 
enrollmentReached: int, 
perkPerEnrollment: double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : 
basicSalary +HRAPer +DAPer 
+((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment)

Constructors:
default constructor: This constructor should 
initialize the instance variables with the proper default values
parameter constructor: with fields in the Order: 
( int id, String name, double basicSalary, double HRAPer, 
double DAPer, int enrollmentTarget, int enrollmentReached, 
double perkPerEnrollment)
*/package test;

public class COJ_15_Sourcing
{
	int id;
	String name;
	double basicSalary,HRAPer,DAPer,perkPerEnrollment;
	int enrollmentReached,enrollmentTarget;
	Double d=0.0;
	public Double calculateGrossSalary()
	{
		d=basicSalary+HRAPer+DAPer+((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment;
		return d;
      
	}
	COJ_15_Sourcing()
	{
		
	}//end of dc()
	COJ_15_Sourcing(int id ,String name,double HRAPer,double perkPerEnrollment, double basicSalary, double DAPer, int enrollmentReached,int enrollmentTarget)
	{	
	
	}//end of pc()
}//end of class
