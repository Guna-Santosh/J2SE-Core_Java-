/*
Program-14
Define a method which returns a String containing natural numbers between a given ranges separated by a single space.

Write the method with following specifications
Name of method: getNumbersInRange() // accepts two integer value, return the number between the given range
Arguments: Two arguments of integer type, start_val and end_val
Return Type: A String value
Example:
Inputs: 10 1
Output: 9 8 7 6 5 4 3 2
Inputs: 3 0
Output: 2 1
Inputs: 3 2
Output: -4 // as the difference between 3 and 2 is 1
Specifications: The value returned by the method getNumbersInRange() is determined by the following rules:
If the input values are negative, return "-1" as string
If the input values are equal, return "-2" as string
If the first argument value is less than second argument value, return "-3" as string
If the difference between second argument and first argument is 1, return "-4" as string
In other case return a string with every value separated by single blank space.
Note: Numbers in range must not include start value and end value.*/
package LAB_CS_PDF1;

public class Prog14 {
	public String getNumbersInRange(int a,int b)
	   { String c=" ";
	   if(a<0 || b<0)
			return "-1";
	   else if(a==b)
			return "-2";
	   else if(a<b)
		   return "-3";
	  else if(a-b==1)
		   return "-4";
	  /* else if(a>b)//b+1
	   {
		   //c=(a-1)+" ";
		   a--;
		   System.out.print(a+c);
		   getNumbersInRange(a,b);
		  //return c+getNumbersInRange(a,b);
		  
	   }*/
	  else
		  for(int i=a-1;i>b;i--) 
		  {
			 System.out.println(i); 
		  }
			return c;
	}
	public static void main(String[] args)
	{ 
		Prog14 obj=new Prog14();
System.out.println(obj.getNumbersInRange(3,2));
}
}
