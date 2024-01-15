/*
Program-34
Create a method to find the 
sum of the cubes of the digits of an n digit number
Method Name 	findSum 
Method Description 
Find the sum cubes of the digits of an n digit number 
Argument 	Int 
Return Type 	Int 
Logic 	Return the sum of cubes of the digits of an n digit number 
Example 
Input : 123 
Output : 1^3+2^3+3^3= 1+8+27=36 

Hint: Use %(mod) operator to separate each digit */
package LAB_CS_PDF1;

public class Prog34 {
	int findSum(int n)
	{  int a=0,sum=0;
	     for(;n>0;) 
	    //	while(n>0)
	    {
		   a=n%10;
		   sum=sum+a*a*a;
		   n=n/10;
	    }	
	return sum;
	}
	
public static void main(String[] args) {
	Prog34 fn=new Prog34();
System.out.println(fn.findSum(122));	
}
}
