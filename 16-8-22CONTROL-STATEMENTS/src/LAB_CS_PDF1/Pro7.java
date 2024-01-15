/*
Program-7
Define a method which returns the square of the given number if it is an even, return cube of the given number if it is an odd number.

Write the method with the following specifications: 
Name of method: calculate() // which accepts an integer value as argument and return square of the given value if it is an even, return cube of the given value if it is an odd number.
Arguments: one argument of type integer
Return Type: an integer value 
Specifications: The value returned by the method calculates () is determined by the following rules:
If the given number is negative or zero, return -1.
If the given number is even, return square of the number.
If the given number is odd, return cube of the given number.*/
package LAB_CS_PDF1;
public class Pro7 
{   int p;
	public int calculate(int a)
	{
	if(a<=0)
		return -1;
	else if(a%2==0)
		return a*a;
	else 
		return a*a*a;
	}
	public static void main(String[] args)
	{
	Pro7 obj=new Pro7();
	System.out.println(obj.calculate(0));
	}
}
