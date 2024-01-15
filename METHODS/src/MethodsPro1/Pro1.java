package MethodsPro1;
/*method is a area where we can write a logic.
method is a block of code. 
It is used to achieve the reusability of code. 
We write a method once and use it many times.
the most important method is main().
/*public                int            m1        (int a,int b)
acess specification  return type  method name   parameter list	   
 {
    method body
 }
 */ 
  /*already defined in the Java class libraries pre-define 
 We can directly use these methods just by calling them in the program at any point
 user defined method()
 */


public class Pro1 
{
     int m;
	int roll;

	void m(int m) 
   {
	  this.m=m;
	  System.out.println(m);
   }
	public void setRoll(int roll)   
	{  
	this.roll = roll;  
	System.out.println(roll);
	}  
	public int getRoll(int roll)   
	{  
         return 985;
	}  
	
	
  public static void main(String[] args)
  {
	           Pro1 p1   =new Pro1();
	            p1.m(99);
	            p1.setRoll(998);
	            p1.getRoll(985);
  
	  
	  
	  
}//end of main()	
}//end of class
