/*Class COJ_15_Trainer
Fields: 
id: int, 
name : String,
 basicSalary : double, 
 HRAPer : double,
 DAPer : double, 
 batchCount: int, 
 perkPerBatch: double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as :
 basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch)

Constructors:
default constructor: This constructor should initialize
 the instance variables with the proper default values
parameter constructor: Create with fields in the Order: 
( int id, String name, double basicSalary, 
          double HRAPer, double DAPer, int batchCount,double perkPerBatch)
*/package test;

public class COJ_15_Trainer {

	int id;
	String name;
	double HRAPer,DAPer,basicSalary;
	int batchCount;
	double perkPerBatch;
	Double c=0.0;
	public Double calculateGrossSalry()
	{
	c=basicSalary+HRAPer+DAPer+(batchCount*perkPerBatch);
		return c;
	}//end of m()
	
	COJ_15_Trainer()
	{
		
	}//end of dc()	
	COJ_15_Trainer(int id, String name, double basicSalary, double HRAPer, double DAPer, int batchCount,double perkPerBatch )
	{
		 
		   this.id=id;
		   this.name=name;
		   this.HRAPer=HRAPer;
		   this.DAPer=DAPer;
		   this.basicSalary=basicSalary;
		   this.batchCount=batchCount;
		   this.perkPerBatch=perkPerBatch;
	}//end of pc()
	
	
	
}//end of class
