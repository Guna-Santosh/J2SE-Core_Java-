/*Program-1
Define a method which returns the sum of three numbers after rounding off 
each number to the next multiple of 10. 
If any of the given number is multiple of 10 don’t change its value
Write the method with the following specifications: 

Name of method: sumOfMultiples() 
Arguments: three argument of type integer
Return Type: an integer value 
Example
If a = 23, b = 34, c = 69
   30 + 40 + 70 = 140
If a = 23, b = 34, c = 50
   30 + 40 + 50 = 120
 Specifications: The value returned by the method sumOfMultiples() is determined by the following rules:
If any of the given number is negative or zero, return -1.
If the number is an multiple of 10
If the given number is odd, return cube of the given number.
*/
package codes;

public class Prog1_sumOfMultiples {
	
	int sumOfMultiples(int a,int b,int c) 
	{
		
		if(a<=0||b<=0||c<=0)
			return -1;
		if(a%10==0)a=(a/10)*10;
		else a=(a/10+1)*10;
	    if(b%10==0)b=(b/10)*10;
	    else b=(b/10+1)*10;
	    if(c%10==0)c=(c/10)*10;
	    else c=(c/10+1)*10;
		return a+b+c;
	} 
public static void main(String[] args) {
	Prog1_sumOfMultiples sm=new Prog1_sumOfMultiples();
	System.out.println(sm.sumOfMultiples(23, 34, 50));
}
}
