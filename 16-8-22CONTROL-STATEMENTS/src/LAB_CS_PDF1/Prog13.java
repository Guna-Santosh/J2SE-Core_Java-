/*
Program-13
Define a method which returns a String containing natural numbers between ranges of two numbers separated by a single space.

Write the method with the following specifications:
Name of method: getNumbersInRange()
Arguments: 2 Arguments of int type 
Return Type: A String value
Values must not be negative. If yes, then return -1 as string.                    values must not be same. If yes, then return -2 as string.                         
 1st arguments value must not be greater than 2nd arguments value. If yes, then return -3 as string.
Exclude the first and last value and return the result as one string with every value separated by single blank space.*/
package LAB_CS_PDF1;

public class Prog13 {
	public String getNumbersInRange(int a,int b)
	   { String c=" ";
	   if(a<=0 || b<=0)
			return "-1";
	   else if(a==b)
			return "-2";
	   else if(a>b)
		   return "-3";
	   else if(a<b-1)
	   {
		   c=(a+1)+" ";
		   return c+getNumbersInRange(++a,b);
		  
	   }
			return c;
	}
	public static void main(String[] args)
	{ 
		Prog13 obj=new Prog13();
		System.out.println(obj.getNumbersInRange(10,20));
}}
