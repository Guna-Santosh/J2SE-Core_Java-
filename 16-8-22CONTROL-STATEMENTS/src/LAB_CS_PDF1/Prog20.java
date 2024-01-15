/*
Program-20
Define a Method that checks for whether a given 
input is a prime number or not,
and return a string.

Write the method with following specifications

Name of method: checkPrime
Arguments: 1 Integer Argument 
Return Type: A String value
Value must not be negative. 
If yes, then return -1 as string.
Value must not be 0 or 1. 
If yes, then return -2 as string.
If value is a prime number, 
then return true as string otherwise 
return false as string.*/
package LAB_CS_PDF1;

public class Prog20 {
String checkPrime(int a)
{ 
   int b=0;
	if(a<0)
		return "-1";
	else if(a==0||a<1)
		return "-2";
	else 
	{	
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)b++;
		}   
	     if(b==2)
	       return"true";
		else
		   return "false";
     }
}	
public static void main(String[] args) {
	Prog20 obj=new Prog20();
System.out.println(obj.checkPrime(3));	
}
}