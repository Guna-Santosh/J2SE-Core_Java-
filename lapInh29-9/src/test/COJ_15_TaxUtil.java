/*Class COJ_15_TaxUtil
Fields: None
Public Methods:
calculateTax(COJ_15_Employee) - returns a double
calculateTax(COJ_15_Manager) - returns a double
calculateTax(COJ_15_Trainer) - returns a double
calculateTax(COJ_15_Sourcing) - returns a double

Tax Calculation Logic: 
If gross salary is greater than 30000 tax is 20% else, tax is 5%
*/package test;

public class COJ_15_TaxUtil 
{
public Double calculate(COJ_15_Employee emp) 
{
	double tax;
	if(emp.a>30000) 
	{
	    return  tax=emp.a*0.2;
	}
	else 
	{
	  return tax=emp.a*0.05;	
	}

	
}//end of cal(emp.e)
public Double calculate(COJ_15_Manager mng) 
{ 
	double tax;
	if(mng.b>30000) 
	{
	    return tax=mng.b*0.2;
	}
	else 
	{
	  return tax=mng.b*0.05;	
	}

	
}//end of cal(man.m)
public Double calculate(COJ_15_Trainer tra) 
{
	if(tra.c>30000) 
	{
	    double tax=tra.c*0.2;
	}
	else 
	{
	  double tax=tra.c*0.05;	
	}
	return null;
	
}//end of cal(tra.t)
public Double calculate(COJ_15_Sourcing src) 
{
	if(src.d>30000) 
	{
	    double tax=src.d*0.2;
	}
	else 
	{
	  double tax=src.d*0.05;	
	}
	return null;
	
}//end of cal(src.s) 


}//end of class
