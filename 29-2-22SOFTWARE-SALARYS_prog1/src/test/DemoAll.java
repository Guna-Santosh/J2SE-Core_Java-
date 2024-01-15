/*Que-1)
_____________________________

The payroll system of an organization involves calculating the gross salary of each type of employee and the tax applicable to each.
Generate and add the constructors for each class as described below.

Class COJ_15_Employee
Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer

Constructors:
default constructor: This constructor should initialize the instance variables with the proper default values
parameter constructor: Create with fields in the Order: ( int id, String name, double basicSalary, double HRAPer, double DAPer)

Class COJ_15_Manager
Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, projectAllowance: double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer + projectAllowance

Constructors:
default constructor: This constructor should initialize the instance variables with the proper default values
parameter constructor: Create with fields in the Order: ( int id, String name, double basicSalary, double HRAPer, double DAPer, double projectAllowance)

Class COJ_15_Trainer
Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, batchCount: int, perkPerBatch: double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch)

Constructors:
default constructor: This constructor should initialize the instance variables with the proper default values
parameter constructor: Create with fields in the Order: ( int id, String name, double basicSalary, double HRAPer, double DAPer, int batchCount,double perkPerBatch)

Class COJ_15_Sourcing
Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, enrollmentTarget: int, enrollmentReached: int, perkPerEnrollment: double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer +((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment)

Constructors:
default constructor: This constructor should initialize the instance variables with the proper default values
parameter constructor: with fields in the Order: ( int id, String name, double basicSalary, double HRAPer, double DAPer, int enrollmentTarget, int enrollmentReached, double perkPerEnrollment)


Class COJ_15_TaxUtil
Fields: None
Public Methods:
calculateTax(COJ_15_Employee) - returns a double
calculateTax(COJ_15_Manager) - returns a double
calculateTax(COJ_15_Trainer) - returns a double
calculateTax(COJ_15_Sourcing) - returns a double

Tax Calculation Logic: If gross salary is greater than 30000 tax is 20% else, tax is 5%

Note : All the fields of above classes must be declared as non-private.

A COJ_15_Constructor class is given to you with the main Method. Use this class to test your solution.
*/package test;
import test.*;
public class DemoAll
{
public static void main(String[] args)
{
	java.util.Scanner s=new java.util.Scanner(System.in);
	System.out.println("1.EMPLOYEE\t2.MANAGER\n3.TRAINER\t4.SOURCING");
	System.out.println("====SELECT 1 OPTION====");
	int choice=s.nextInt();
	
	switch(choice) 
	{
	case 1:
		System.out.print("ENTER THE ID = ");    
		int id=s.nextInt();	
		System.out.print("ENTER THE NAME = "); 
		String name= s.nextLine();s.next();
		System.out.print("ENTER THE BASICsALARY = "); 
		double basicSalary=s.nextDouble();
		System.out.print("ENTER THE HRAPER = "); 
		double HRAPer=s.nextDouble();
		System.out.print("ENTER THE DAPER = "); 
		double DAPer=s.nextDouble();
		COJ_15_TaxUtil  taxut=new COJ_15_TaxUtil();
		COJ_15_Employee emp = new COJ_15_Employee 
				   (id,name,basicSalary,HRAPer,DAPer);	
		Double empgr=emp.calculateGrossSalary();
		Double result = taxut.calculate(emp);
		System.out.println("DEAR EMPLOYE YOUR TOTAL SALARY = "+empgr);
		System.out.println("YOUR TAX IS = "+result);
		break;
	case 2:
		System.out.print("ENTER THE ID = ");    
		int idm=s.nextInt();	
		System.out.print("ENTER THE NAME = ");  
		String namem= s.nextLine();s.next();
		System.out.print("ENTER THE BASICsALARY = "); 
		double basicSalarym=s.nextDouble();
		System.out.print("ENTER THE HRAPER = "); 
		double HRAPerm=s.nextDouble();
		System.out.print("ENTER THE DAPER = "); 
		double DAPerm=s.nextDouble();
		System.out.print("ENTER THE PROJECTALLOWANCE = ");   
		double ProjectAllowancem=s.nextDouble();
		//System.out.println("DEAR "+namem);	
		COJ_15_TaxUtil  taxutm=new COJ_15_TaxUtil();
		COJ_15_Manager mrg=new COJ_15_Manager 
				   (idm,namem,basicSalarym,HRAPerm,DAPerm,ProjectAllowancem);
		Double resultm=mrg.calculateGrossSalarym();
		Double mrgr=taxutm.calculate(mrg);
		System.out.print(" DEAR MANAGER YOUR SALARY = "+resultm);
		System.out.print("\nYOUR TAX IS = "+mrgr);
		
		break;
	case 3:
		System.out.print("ENTER THE BATCHCOUNT = ");
		int batchCount=s.nextInt();
		System.out.print("ENTER THE PERKPERBATCH = ");
		Double perkPerBatch=Double.parseDouble(s.nextLine());
		
		
		//COJ_15_Trainer  tra =new COJ_15_Trainer
		//(id,name,basicSalary,HRAPer,DAPer,batchCount,perkPerBatch);
		break;
	case 4:
		System.out.print("ENTER THE PERKPERENROLLMENT = "); 
		Double perkPerEnrollment=Double.parseDouble(s.nextLine());
		System.out.print("ENTER THE ENROLLMENTREACHED = ");
		Integer enrollmentReached = Integer.parseInt(s.nextLine());
		System.out.print("ENTER THE ENROLLMENTTARGET = ");
		Integer enrollmentTarget =Integer.parseInt(s.nextLine());
		
		
		
		//COJ_15_Sourcing src = new COJ_15_Sourcing
		//(id,name,perkPerEnrollment,HRAPer,basicSalary,DAPer,enrollmentReached,enrollmentTarget);

		break;
	default :
		System.out.println("ÏNVALID OPTION U CHOICE......");
	}//end of switch
	s.close();
	
}//end of main()
}//end of class
